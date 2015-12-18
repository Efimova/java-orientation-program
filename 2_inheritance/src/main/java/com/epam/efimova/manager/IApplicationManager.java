package com.epam.efimova.manager;

import com.epam.efimova.controller.ApplicationTypes;
import com.epam.efimova.entity.Application;

/**
 * Created by Anna_Efimova on 12/18/2015.
 */
public interface IApplicationManager {
    Application start(ApplicationTypes.MessengerTypes types);
    void close();

}
