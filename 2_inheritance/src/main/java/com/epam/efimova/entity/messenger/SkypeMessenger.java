package com.epam.efimova.entity.messenger;

import com.epam.efimova.entity.Contact;
import com.epam.efimova.entity.Message;
import com.epam.efimova.entity.Messenger;
import com.epam.efimova.exception.UserNameFailException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anna_Efimova on 12/7/2015.
 */
public class SkypeMessenger extends Messenger implements ISendingMessage {
    private static Logger logger = LoggerFactory.getLogger(SkypeMessenger.class);
    private Contact currentUser = null;

    public SkypeMessenger() {
        tryLogin();
    }

    private void tryLogin() {
        logger.info("Skype messenger is checking authentication... ");
        if (currentUser == null) {
            try {
                createCurrentContact();
            } catch (UserNameFailException e) {
                logger.error("UserName \"" + currentUser.getUserName() + "\" was not found.");
            }
        }

    }

    private void createCurrentContact() throws UserNameFailException {
        currentUser = new Contact();
        try {
            System.out.println("Sign in. \n Input you userName:");
            String userName = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            identify(userName);
            currentUser.setUserName(userName);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }

    private void identify(String userName) throws UserNameFailException {
        //TODO Create dao layer
        throw new UserNameFailException();
    }


    @Override
    protected void launch() {
        logger.info("Skype messenger is launching... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.error(e.getMessage());
        }
        logger.info("Skype messenger is started");
    }

    @Override
    public void close() {
        logger.info("Skype messenger is stopping...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.error(e.getMessage());
        }
        logger.info("Skype messenger is started");
    }


    @Override
    public void send(Message message) {

    }

    @Override
    public String getStatus(Integer id) {
        return null;
    }
}
