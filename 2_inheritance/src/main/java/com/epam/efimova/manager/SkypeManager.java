package com.epam.efimova.manager;

import com.epam.efimova.dao.ContactMapDao;
import com.epam.efimova.dao.IContactDao;
import com.epam.efimova.dao.IMessageDao;
import com.epam.efimova.dao.MessageDao;
import com.epam.efimova.entity.Application;
import com.epam.efimova.entity.Contact;
import com.epam.efimova.entity.Message;
import com.epam.efimova.entity.Messenger;
import com.epam.efimova.entity.messenger.SkypeMessenger;
import com.epam.efimova.exception.UserCredentialException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anna_Efimova on 12/17/2015.
 */
public class SkypeManager implements IMessengerManager {
    private static Logger logger = LoggerFactory.getLogger(SkypeManager.class);

    private static final SkypeManager instance = new SkypeManager();
    private SkypeMessenger skypeMessenger;

    public static SkypeManager getInstance() {
        return instance;
    }

    private SkypeManager() {
    }

    @Override
    public void start() {

        skypeMessenger = new SkypeMessenger();

        tryLoginWithCache();

    }

    @Override
    public void tryLoginWithCache() {

        if (((SkypeMessenger) getApplication()).getCachingUser() != null) {
            logger.info("Skype is trying to authenticate caching user... ");
        }

    }

    @Override
    public void login(Messenger app) {

        if (((SkypeMessenger) app).getCurrentUser() == null) {
            logger.info("Skype is trying to login user... ");
            try {
                createCurrentContact(app);
            } catch (UserCredentialException e) {
                logger.error("UserName \"" + ((SkypeMessenger) app).getCurrentUser().getUserName() + "\" was not found.");
            }
        }
    }

    @Override
    public void establishChatWith(Contact contact) {
        logger.info("Opening the new chat window with user -> " + contact.getUserName());
    }

    @Override
    public void logout() {
        logger.info("logout user ->" + skypeMessenger.getCurrentUser());
        skypeMessenger.setCachingUser(null);
        skypeMessenger.setCurrentUser(null);
        skypeMessenger.setContactList(null);
        skypeMessenger.setHistoryMesseges(null);
        skypeMessenger.setMessage(null);


    }

    private void createCurrentContact(Messenger app) throws UserCredentialException {

        try {
            System.out.println("Sign in. \n Input your username:");
            String username = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            System.out.println("\n Input your password:");
            String password = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            Contact contact = identify(username, password);
            ((SkypeMessenger) app).setCurrentUser(contact);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }

    private Contact identify(String userName, String password) throws UserCredentialException {
        IContactDao contactDao = new ContactMapDao();
        Contact contact = contactDao.identify(userName, password);
        if (contact == null)
            throw new UserCredentialException();
        return contact;
    }

    @Override
    public void send(Message message) {
        IMessageDao messageDao = new MessageDao();
        messageDao.add(message);
        logger.info("Message was sent");
    }

    @Override
    public String checkMessageStatus(Message message) {
        IMessageDao messageDao = new MessageDao();

        return messageDao.getStatus(message.getId());
    }


    @Override
    public void edit(Message message) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int delete(Message message) {
        throw new UnsupportedOperationException();
    }


    @Override
    public void close() {
        logger.info("Skype is stopping...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.error(e.getMessage());
        }
        logger.info("Skype was stopped");
    }

    @Override
    public Application getApplication() {
        return skypeMessenger;
    }
}
