package com.epam.efimova.entity.messenger;

import com.epam.efimova.entity.Contact;
import com.epam.efimova.entity.Messenger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Anna_Efimova on 12/7/2015.
 */
public class SkypeMessenger extends Messenger {
    private static Logger logger = LoggerFactory.getLogger(SkypeMessenger.class);
    private Contact currentUser = null;
    //current field is not nullable when app is closed, but otherwise if user is logout ;
    private Contact cachingUser = null;

    public SkypeMessenger() {
        logger.info("Skype is launching...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            logger.error(e.getMessage());
        }
        logger.info("Skype was launched");
    }

    public Contact getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Contact currentUser) {
        this.currentUser = currentUser;
        this.cachingUser = currentUser;
    }

    public Contact getCachingUser() {
        return cachingUser;
    }

    public void setCachingUser(Contact cachingUser) {
        this.cachingUser = cachingUser;
    }
}
