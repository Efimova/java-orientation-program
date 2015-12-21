package com.epam.efimova.classsloader;

import java.io.ByteArrayOutputStream;
import java.io.File;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.HashMap;

import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;


public class CustomClassLoader extends ClassLoader {
    Map<String, Class<?>> hashMap = new HashMap();

    public CustomClassLoader() {

        super(CustomClassLoader.class.getClassLoader().getParent());
    }

    private String jarFile = "d:\\trainings\\orientProgram\\classes.jar"; // Path to the jar
    // file

    private byte[] getBytes(String filename) throws IOException {
        JarFile jar = new JarFile(jarFile);
        JarEntry entry = jar.getJarEntry(filename);
        if (entry == null) {
            throw new IOException("Can't read all ");
        }
        InputStream is = jar.getInputStream(entry);
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int nextValue = is.read();
        while (-1 != nextValue) {
            byteStream.write(nextValue);
            nextValue = is.read();
        }

        byte raw[] = byteStream.toByteArray();

        // File file = new File(filename);
        //
        // System.out.println(file.getAbsolutePath());
        // long len = file.length();
        // byte raw[] = new byte[(int) len];
        //
        // FileInputStream fin = new FileInputStream(file.getAbsolutePath());
        // int r = fin.read(raw);
        // if (r != len)
        // throw new IOException("Can't read all, " + r + " != " + len);
        //
        // fin.close();

        return raw;
    }

    // Spawn a process to compile the java source code file
    // specified in the 'javaFile' parameter. Return a true if
    // the compilation worked, false otherwise.
    private boolean compile(String javaFile) throws IOException {
        // Let the user know what's going on
        System.out.println("CCL: Compiling " + javaFile + "...");

        // Start up the compiler
        Process p = Runtime.getRuntime().exec("javac " + javaFile);

        // Wait for it to finish running
        try {
            p.waitFor();
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }

        // Check the return code, in case of a compilation error
        int ret = p.exitValue();

        // Tell whether the compilation worked
        return ret == 0;
    }

    public Class loadClass(String name, boolean resolve) throws ClassNotFoundException {

        Class<?> clas = null;

        clas = findLoadedClass(name);

        String fileStub = name.replace('.', '/');

        String javaFilename = fileStub + ".java";
        String classFilename = fileStub + ".class";

        File javaFile = new File(javaFilename);
        File classFile = new File(classFilename);

        if (javaFile.exists() && (!classFile.exists() || javaFile.lastModified() > classFile.lastModified())) {

            try {

                if (!compile(javaFilename) || !classFile.exists()) {
                    throw new ClassNotFoundException("Compile failed: " + javaFilename);
                }
            } catch (IOException ie) {

                throw new ClassNotFoundException(ie.toString());
            }
        }

        try {

            byte raw[] = getBytes(classFilename);

            clas = defineClass(null, raw, 0, raw.length);
            System.out.println("defineClass " + clas.getName());
        } catch (IOException ie) {

            // This is not a failure! If we reach here, it might
            // mean that we are dealing with a class in a library,
            // such as java.lang.Object
        }

        if (clas == null) {
            clas = findSystemClass(name);
        }
        System.out.println(resolve && clas != null);
        //if (resolve && clas != null)
        resolveClass(clas);

        if (clas == null)
            throw new ClassNotFoundException(name);

        // Otherwise, return the class
        return clas;
    }

    /**
     * Method check which class will load faster
     */
    public void checkClassLoadingOrder() {
        URL[] urls = null;
        try {
            urls = new URL[]{new URL("file:///e:/orientProgram/Test1.jar"),
                    new URL("file:///e:/orientProgram/Test2.jar")};
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        }

        try (URLClassLoader ucl = new URLClassLoader(urls)) {

            Class<?> clazz = ucl.loadClass("com.epam.test.classloader.Test");
            Method method = clazz.getMethod("execute", String[].class);
            method.invoke(clazz.newInstance(), new Object[]{new String[]{"First", "Second"}});
        } catch (NoSuchMethodException | SecurityException | ClassNotFoundException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }


    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        Class cl = super.loadClass(name);
        hashMap.put(cl.getCanonicalName(), cl);
        return cl;
    }

    public static void main(String[] args) throws Exception {

        String progClass = "Foo";

        String progArgs[] = {"str1", "str2"};

        CustomClassLoader ccl = new CustomClassLoader();

        Class clas = ccl.loadClass(progClass);

        Class mainArgType[] = {(new String[0]).getClass()};

        // Find the standard main method in the class
        Method main = clas.getMethod("main", mainArgType);

        Object argsArray[] = {progArgs};

        // Call the method
        main.invoke(null, argsArray);
        System.out.println(ccl.hashMap);
        System.out.println(ccl.hashMap.get("Foo"));
        System.out.println(ccl.hashMap.get("Bar").getClassLoader());
        System.out.println(ccl.hashMap.get("Baz").getClassLoader());
    }

}
