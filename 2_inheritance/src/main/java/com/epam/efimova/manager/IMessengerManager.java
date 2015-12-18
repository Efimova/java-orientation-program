package com.epam.efimova.manager;

import com.epam.efimova.entity.Application;
import com.epam.efimova.entity.Message;

/**
 * Created by Anna_Efimova on 12/17/2015.
 */
public interface IMessengerManager extends IApplicationManager{
    int send(Message message);

    void edit(Message message);

    int delete(Message message);

}
