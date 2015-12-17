package com.epam.efimova.entity.messenger;

import com.epam.efimova.entity.Contact;
import com.epam.efimova.entity.Message;
import com.epam.efimova.entity.Messenger;

/**
 * Created by Anna_Efimova on 12/7/2015.
 */
public class ViberMessenger extends Messenger implements IForwardMessage, ISendingMessage  {
    @Override
    public void launch() {

    }

    @Override
    public void close() {

    }

    @Override
    public void send(Message message) {

    }

    @Override
    public String getStatus(Integer id) {
        return null;
    }


    @Override
    public void forward(Contact contact, Message message) {

    }
}
