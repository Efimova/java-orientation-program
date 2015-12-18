package com.epam.efimova.main;

import com.epam.efimova.controller.ApplicationController;
import com.epam.efimova.controller.ApplicationTypes;
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

    public static void main(String[] args) {
        ApplicationController applicationController = ApplicationController.getInstance();
        Messenger skypeMessenger = (Messenger) applicationController.doStart(ApplicationTypes.MESSENGER);
        applicationController.login

    }
}
