package com.epam.efimova;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * TODO не завершено
 */
public class App {
    public static void main(String[] args) {
        String original = "Моя строка";
        try {
            byte[] utf8Bytes = original.getBytes("UTF16");
            byte[] defaultBytes = original.getBytes();
            String roundTrip = new String(utf8Bytes, "UTF8");
            System.out.println("roundTrip = " + roundTrip);
            System.out.println();
          //  printBytes(utf8Bytes, "utf8Bytes");
            System.out.println();
        //    printBytes(defaultBytes, "defaultBytes");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }



    }
//    public static void printBytes(byte[] array, String name) {
//        for (int k = 0; k < array.length; k++) {
//            System.out.println(name + "[" + k + "] = " + "0x" +
//                    UnicodeFormatter.byteToHex(array[k]));
//        }
//    }
}
