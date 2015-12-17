package com.epam.efimova.entity.messenger;

import com.epam.efimova.entity.Message;

/**
 * Created by Anna_Efimova on 12/17/2015.
 */
public interface ISendingMessage {
    void send(Message message);

    String getStatus(Integer id);

}
