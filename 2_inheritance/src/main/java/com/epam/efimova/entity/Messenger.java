package com.epam.efimova.entity;

import java.util.List;

/**
 * Created by Anna_Efimova on 12/7/2015.
 */
public abstract class Messenger extends Application {
    public Message message;
    public List<Contact> contactList;
    public List<Message> historyMesseges;


    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<Message> getHistoryMesseges() {
        return historyMesseges;
    }

    public void setHistoryMesseges(List<Message> historyMesseges) {
        this.historyMesseges = historyMesseges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Messenger messenger = (Messenger) o;

        if (message != null ? !message.equals(messenger.message) : messenger.message != null) return false;
        if (contactList != null ? !contactList.equals(messenger.contactList) : messenger.contactList != null)
            return false;
        return !(historyMesseges != null ? !historyMesseges.equals(messenger.historyMesseges) : messenger.historyMesseges != null);

    }

    @Override
    public int hashCode() {
        int result = message != null ? message.hashCode() : 0;
        result = 31 * result + (contactList != null ? contactList.hashCode() : 0);
        result = 31 * result + (historyMesseges != null ? historyMesseges.hashCode() : 0);
        return result;
    }
}
