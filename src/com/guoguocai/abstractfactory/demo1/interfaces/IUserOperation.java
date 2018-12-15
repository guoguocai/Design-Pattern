package com.guoguocai.abstractfactory.demo1.interfaces;

import com.guoguocai.abstractfactory.demo1.po.User;

/**
 * @auther guoguocai
 * @date 2018/12/15 21:44
 */
public interface IUserOperation {

    void insertUser(User user);

    User getUser(int id);
}
