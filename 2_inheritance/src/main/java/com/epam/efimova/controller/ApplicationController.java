package com.epam.efimova.controller;

import com.epam.efimova.entity.Application;
import com.epam.efimova.entity.messenger.SkypeMessenger;
import com.epam.efimova.exception.UnsupportedApplicationException;
import com.epam.efimova.manager.IApplicationManager;
import com.epam.efimova.manager.SkypeManager;
import com.epam.efimova.manager.ViberManager;

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
            case SKYPE:
                manager = SkypeManager.getInstance();
                break;
            default:
                throw new UnsupportedApplicationException();

        }
        manager.start();
        return manager.getApplication();
    }


    public void doClose(Application application) {
        if (application instanceof SkypeMessenger) {
            SkypeManager.getInstance().close();
        }
    }
}
