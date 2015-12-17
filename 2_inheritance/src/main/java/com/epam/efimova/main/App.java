package com.epam.efimova.main;

import com.epam.efimova.entity.Application;
import com.epam.efimova.entity.Contact;
import com.epam.efimova.entity.Message;
import com.epam.efimova.entity.Messenger;
import com.epam.efimova.entity.messenger.SkypeMessenger;
import com.epam.efimova.manager.IMessengerManager;
import com.epam.efimova.manager.MessengerManager;


/**
 * Hello world!
 */
public class App {
    private static final String SKYPE_APPL = "skype";

    public static void main(String[] args) {
        IMessengerManager manager = new MessengerManager();
        Messenger skypeMessenger = (Messenger) manager.start(SKYPE_APPL);


    }
}
