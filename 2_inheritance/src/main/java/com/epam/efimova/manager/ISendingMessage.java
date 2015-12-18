package com.epam.efimova.manager;

import com.epam.efimova.entity.Message;

/**
 * Created by Anna_Efimova on 12/17/2015.
 */
public interface ISendingMessage {
    void send(Message message);

    String checkMessageStatus(Message message);
}
