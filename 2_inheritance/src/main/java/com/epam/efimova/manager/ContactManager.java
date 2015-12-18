package com.epam.efimova.manager;

import com.epam.efimova.dao.ContactMapDao;
import com.epam.efimova.dao.IContactDao;
import com.epam.efimova.entity.Contact;

/**
 * Created by Anna_Efimova on 12/19/2015.
 */
public class ContactManager {
    private static final ContactManager instance = new ContactManager();

    public static ContactManager getInstance() {
        return instance;
    }

    private ContactManager() {

    }

    public Contact getByName(String friendUserName) {
        IContactDao contactDao = new ContactMapDao();
        return contactDao.getByName(friendUserName);
    }
}
