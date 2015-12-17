package com.epam.efimova.manager;

import com.epam.efimova.entity.Application;
import com.epam.efimova.entity.Contact;
import com.epam.efimova.entity.Message;
import com.epam.efimova.entity.Messenger;
import com.epam.efimova.entity.messenger.SkypeMessenger;

/**
 * Created by Anna_Efimova on 12/17/2015.
 */
public class MessengerManager implements IMessengerManager {
    @Override
    public Application start(String appl) {
        switch (appl) {
            case "skype":
                return new SkypeMessenger();

            default:
                throw new UnsupportedOperationException();
        }

    }

    @Override
    public int send(Message message) {
        return 0;
    }

    @Override
    public void edit(Message message) {

    }

    @Override
    public int delete(Message message) {
        return 0;
    }

    @Override
    public void close() {

    }
}
