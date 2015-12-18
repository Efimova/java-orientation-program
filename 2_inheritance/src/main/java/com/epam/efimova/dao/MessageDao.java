package com.epam.efimova.dao;

import com.epam.efimova.entity.Message;

import java.util.Date;

/**
 * Created by Anna_Efimova on 12/19/2015.
 */
public class MessageDao implements IMessageDao {
    @Override
    public Integer add(Message message) {

        message.setId(123);
        message.setDate(new Date());
        message.setStatus("Sent");
        //TODO stub sending;
        return message.getId();
    }

    @Override
    public String getStatus(Integer id) {
        //TODO stub status was viewed;
        return "viewed";
    }
}
