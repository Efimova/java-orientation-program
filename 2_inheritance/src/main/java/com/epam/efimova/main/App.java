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
 * Emulate the application launching, ex. skype launching.
 * Controller - emulate the work of Servlet, build on similar like Struts actions
 * Manager - layer responsible for logic of application
 * Model - entities stored the state of object. Bild on the encapsulation principe
 * View - is the main method in app.
 */
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        //Emulate starting the skype app
        ApplicationController applicationController = ApplicationController.getInstance();
        Messenger messenger = (Messenger) applicationController.doStart(ApplicationTypes.SKYPE);


        SkypeController skypeController = SkypeController.getInstance((SkypeMessenger) messenger);
        skypeController.doLogin();
        LOGGER.info(skypeController.getPersonalInfo());

        ContactManager contactManager = ContactManager.getInstance();
        Contact toContact = contactManager.getByName("AnyUserName");
        skypeController.establishChat(toContact);

        Message message = new Message(toContact, "The message which i'd like to send");
        skypeController.send(message);
        LOGGER.info("Status of the message -> " + skypeController.checkMessageStatus(message));
        skypeController.doLogout();
        applicationController.doClose(messenger);
    }
}
