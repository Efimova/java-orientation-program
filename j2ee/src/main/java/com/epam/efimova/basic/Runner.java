package com.epam.efimova.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anna_Efimova on 12/9/2015.
 */
public class Runner {
    Map map = new HashMap<>();

    public static void main(String[] args) {
        int i = 0;
        Runner runner = new Runner();
        while (true) {

            if(i==10000000){
                i=0;
                runner.map = new HashMap<>();
                System.out.println("i = 0");
            }
            StringBuilder strb = new StringBuilder("str");
            strb.append(++i);
            runner.map.put(strb, new String());
        }
    }
}
