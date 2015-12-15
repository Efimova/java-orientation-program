package com.epam.efimova;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by Anna_Efimova on 12/10/2015.
 */
public class SoftRefExample {
    private Map<String, String> map = new HashMap<>();
    WeakHashMap weakHashMap = new WeakHashMap();
    Integer j = 0;

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Map getMap() {
        return map;
    }

    public void method() {
        String s = "new String()";
        SoftReference softReference = new SoftReference(s);

        weakHashMap.put(++j, softReference);
    }

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        SoftRefExample app = new SoftRefExample();
        SoftReference softReference = new SoftReference(app.getMap());
        while (true) {
            if (i == 10000000) {
                i = 0;
                app.setMap(new HashMap<>());
                System.out.println("j = " + ++j);
            }
            app.method();
            for (Object weakHM : app.weakHashMap.entrySet()){
                System.out.println(((Map.Entry<Integer,String>)weakHM).getValue());

            }
                StringBuilder strb = new StringBuilder("str");
            strb.append(++i);
            app.getMap().put(strb, strb);
        }
    }
}
