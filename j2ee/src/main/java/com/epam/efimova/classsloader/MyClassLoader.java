package com.epam.efimova.classsloader;

import javafx.application.Application;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;


public class MyClassLoader extends ClassLoader {
    public MyClassLoader() {
        super(MyClassLoader.class.getClassLoader());
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> clas = null;
        String fileStub = name.replace('.', '/');

        String classFilename = fileStub + ".class";
        try {
            byte raw[] = getBytes(classFilename);

            clas = defineClass(null, raw, 0, raw.length);
            System.out.println("defineClass " + clas.getName());
        } catch (IOException ie) {

        }

        return clas;
    }

    private String jarFile = "d:\\trainings\\orientProgram\\classes.jar";

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

        return raw;
    }



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


    public static void main(String[] args) throws Exception {
        String progClass = args[0];

        String progArgs[] = new String[args.length - 1];
        System.arraycopy(args, 1, progArgs, 0, progArgs.length);

        MyClassLoader ccl = new MyClassLoader();

        Class clas = ccl.loadClass(progClass);

        Class mainArgType[] = { (new String[0]).getClass() };

        // Find the standard main method in the class
        Method main = clas.getMethod("main", mainArgType);

        Object argsArray[] = { progArgs };

        // Call the method
        main.invoke(null, argsArray);

        System.out.println(Class.forName("Foo"));
    }

}
