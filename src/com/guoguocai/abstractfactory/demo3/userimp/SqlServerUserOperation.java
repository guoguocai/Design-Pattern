package com.guoguocai.abstractfactory.demo3.userimp;

import com.guoguocai.abstractfactory.demo3.interfaces.IUserOperation;
import com.guoguocai.abstractfactory.demo3.po.User;

/**
 * @auther guoguocai
 * @date 2018/12/16 17:15
 */
public class SqlServerUserOperation implements IUserOperation {

    @Override
    public void insertUser(User user) {
        System.out.println("[SQL Server]新增一条 User 记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("[SQL Server]根据 ID 获取 User 表中一条记录");
        return null;
    }
}
