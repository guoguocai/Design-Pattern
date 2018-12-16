package com.guoguocai.abstractfactory.demo3.interfaces;

import com.guoguocai.abstractfactory.demo3.po.User;

/**
 * @auther guoguocai
 * @date 2018/12/16 17:06
 */
public interface IUserOperation {

    void insertUser(User user);

    User getUser(int id);
}
