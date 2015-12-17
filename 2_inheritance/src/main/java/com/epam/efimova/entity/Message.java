package com.epam.efimova.entity;

import java.util.Date;

/**
 * Created by Anna_Efimova on 12/7/2015.
 */
public class Message {
    Integer id;
    String textMessage;
    Date date;
    Contact contact;

    public Message(Contact contact, String textMessage) {
        setContact(contact);
        setTextMessage(textMessage);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
