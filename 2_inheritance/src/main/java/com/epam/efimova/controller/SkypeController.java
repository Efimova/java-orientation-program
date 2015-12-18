package com.epam.efimova.controller;

import com.epam.efimova.entity.Contact;
import com.epam.efimova.entity.Message;
import com.epam.efimova.entity.Messenger;
import com.epam.efimova.entity.messenger.SkypeMessenger;
import com.epam.efimova.manager.IApplicationManager;
import com.epam.efimova.manager.IMessengerManager;
import com.epam.efimova.manager.SkypeManager;

/**
 * Created by Anna_Efimova on 12/18/2015.
 */
public class SkypeController {
    private static SkypeController instance;
    private SkypeMessenger skypeMessenger;
    private IMessengerManager manager;

    {
        manager = SkypeManager.getInstance();
    }

    public static SkypeController getInstance(SkypeMessenger messenger) {
        if (instance == null) {
            instance = new SkypeController(messenger);
        }
        return instance;
    }

    private SkypeController(SkypeMessenger messenger) {
        setSkypeMessenger(messenger);
    }

    public void doLogin() {
        if (getSkypeMessenger().getCurrentUser() == null) {
            manager.login(getSkypeMessenger());
        }
    }

    private void setSkypeMessenger(SkypeMessenger skypeMessenger) {
        this.skypeMessenger = skypeMessenger;
    }

    public SkypeMessenger getSkypeMessenger() {
        return skypeMessenger;
    }

    public String getPersonalInfo() {

        return ((SkypeMessenger) manager.getApplication()).getCurrentUser().toString();
    }

    public void establishChat(Contact anyUserName) {
        manager.establishChatWith(anyUserName);
    }

    public void send(Message message) {
        manager.send(message);
    }


    public String checkMessageStatus(Message message) {
        return manager.checkMessageStatus(message);
    }

    public void doLogout() {
        manager.logout();
    }
}
