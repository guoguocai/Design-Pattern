package com.guoguocai.abstractfactory.demo2.interfaces;

import com.guoguocai.abstractfactory.demo2.po.User;

/**
 * @auther guoguocai
 * @date 2018/12/16 14:48
 */
public interface IUserOperation {

    void insertUser(User user);

    User getUser(int id);
}
