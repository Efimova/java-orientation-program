package com.epam.efimova.manager;

import com.epam.efimova.entity.Contact;
import com.epam.efimova.entity.Message;
import com.epam.efimova.entity.Messenger;

/**
 * Created by Anna_Efimova on 12/17/2015.
 */
public interface IMessengerManager extends IApplicationManager, ISendingMessage {

    void edit(Message message);

    int delete(Message message);

    void tryLoginWithCache();

    void login(Messenger app);

    void establishChatWith(Contact anyUserName);

    void logout();
}
