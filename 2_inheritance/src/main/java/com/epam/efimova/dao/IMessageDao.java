package com.epam.efimova.dao;

import com.epam.efimova.entity.Message;

/**
 * Created by Anna_Efimova on 12/19/2015.
 */
public interface IMessageDao {

    Integer add(Message message);

    String getStatus(Integer id);
}
