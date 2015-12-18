package com.epam.efimova.main;

import com.epam.efimova.controller.ApplicationController;
import com.epam.efimova.controller.ApplicationTypes;
import com.epam.efimova.controller.SkypeController;
import com.epam.efimova.entity.Contact;
import com.epam.efimova.entity.Message;
import com.epam.efimova.entity.Messenger;
import com.epam.efimova.entity.messenger.SkypeMessenger;
import com.epam.efimova.manager.ContactManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 */
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationController applicationController = ApplicationController.getInstance();
        Messenger messenger = (Messenger) applicationController.doStart(ApplicationTypes.SKYPE);

        SkypeController skypeController = SkypeController.getInstance((SkypeMessenger) messenger);
        ContactManager contactManager = ContactManager.getInstance();
        skypeController.doLogin();
        LOGGER.info(skypeController.getPersonalInfo());

        Contact toContact = contactManager.getByName("AnyUserName");
        skypeController.establishChat(toContact);

        Message message = new Message(toContact, "The message which i'd like to send");
        skypeController.send(message);
        LOGGER.info("Status of the message -> " + skypeController.checkMessageStatus(message));
        skypeController.doLogout();
        applicationController.doClose(messenger);
    }
}
