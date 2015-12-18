package com.epam.efimova.manager;

import com.epam.efimova.entity.Contact;
import com.epam.efimova.entity.Message;

/**
 * Created by Anna_Efimova on 12/17/2015.
 */
public interface IForwardMessage {
    void forward(Contact contact, Message message);
}
