package com.epam.efimova;

import java.io.IOException;

/**
 * Created by Anna_Efimova on 12/18/2015.
 */
public class TestB {
    TestB() throws IOException {
        System.out.println("Constructor TestB");
      //  throw new IOException("IOException is invoked in the constructor TestB");
    }

    TestB(String s) {
        System.out.println("Constructor TestB with parameter");
    }
}
