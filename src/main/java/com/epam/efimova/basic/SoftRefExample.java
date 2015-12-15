package com.epam.efimova.basic;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anna_Efimova on 12/10/2015.
 */
public class SoftRefExample {
    private Map<String, String> map = new HashMap<>();


    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Map getMap() {
        return map;
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
            StringBuilder strb = new StringBuilder("str");
            strb.append(++i);
            app.getMap().put(strb, strb);
        }
    }
}
