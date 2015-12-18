package com.epam.efimova;

import java.util.HashMap;
import java.util.Map;

/**
 * нагружаем память и смотрим в VisualVM как нагржается и чиститься память
 */
public class App {
    private Map<String, String> map = new HashMap<>();

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Map getMap() {
        return map;
    }

    public static void main(String[] args) {
        int i = 0;
        App app = new App();
        while (true) {

            if (i == 10000000) {
                i = 0;
                app.setMap(new HashMap<>());
                System.out.println("i = 0");
            }
            StringBuilder strb = new StringBuilder("str");
            strb.append(++i);
            app.getMap().put(strb, strb);
        }
    }
}
