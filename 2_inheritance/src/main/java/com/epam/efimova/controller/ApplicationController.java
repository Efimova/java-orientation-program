package com.epam.efimova.controller;

import com.epam.efimova.entity.Application;
import com.epam.efimova.entity.Messenger;
import com.epam.efimova.manager.IApplicationManager;
import com.epam.efimova.manager.MessengerManager;

/**
 * Created by Anna_Efimova on 12/18/2015.
 */
public class ApplicationController {
    private static ApplicationController instance = null;

    private ApplicationController() {

    }

    public static ApplicationController getInstance() {
        if (instance == null) {
            instance = new ApplicationController();
        }
        return instance;
    }

    public Application doStart(ApplicationTypes types) {
        IApplicationManager manager = null;
        switch (types) {
            case MESSENGER:
                manager = new MessengerManager();
                break;
            default:
                new UnsupportedApplicationManager();
                break;
        }
        return manager.start(ApplicationTypes.MessengerTypes.SKYPE);
    }

    public void login() {

    }
}
