package com.epam.efimova.dao;

import com.epam.efimova.entity.Contact;

/**
 * Created by Anna_Efimova on 12/19/2015.
 */
public class ContactMapDao implements IContactDao {
    @Override
    public Contact identify(String username, String password) {
        //TODO stub
        return new Contact(username, "Anna Efimova", "Epam Systems", "Additional inforamtion: +375296116366");
    }

    @Override
    public Contact getByName(String friendUserName) {
        return new Contact(friendUserName, "Fake User", "OAO", "Additional inforamtion: none");
    }
}
