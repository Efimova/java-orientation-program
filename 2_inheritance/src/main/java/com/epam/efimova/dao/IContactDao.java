package com.epam.efimova.dao;

import com.epam.efimova.entity.Contact;

/**
 * Created by Anna_Efimova on 12/19/2015.
 */
public interface IContactDao {
    Contact identify(String username, String password);

    Contact getByName(String friendUserName);
}