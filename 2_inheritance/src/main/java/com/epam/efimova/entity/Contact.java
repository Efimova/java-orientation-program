package com.epam.efimova.entity;

/**
 * Created by Anna_Efimova on 12/7/2015.
 */
public class Contact {
    private String userName;
    private String fullName;
    private String statusUser;
    private String personalDetail;

    public Contact() {

    }

    public Contact(String userName, String fullName) {
        setUserName(userName);
        setFullName(fullName);

    }

    //TODO think about using setters
    public Contact(String userName, String fullName, String statusUser, String personalDetail) {
        setUserName(userName);
        setFullName(fullName);
        setStatusUser(statusUser);
        setPersonalDetail(personalDetail);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(String statusUser) {
        this.statusUser = statusUser;
    }

    public String getPersonalDetail() {
        return personalDetail;
    }

    public void setPersonalDetail(String personalDetail) {
        this.personalDetail = personalDetail;
    }

    @Override
    public String toString() {
        return getUserName() + "/" + getFullName() + "/" + getPersonalDetail() + "/" + getStatusUser();
    }
}
