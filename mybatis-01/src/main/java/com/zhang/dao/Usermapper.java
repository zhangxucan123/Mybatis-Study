package com.zhang.dao;


import com.zhang.pojo.User;

import java.util.List;

//操作实体类 dao ==mapper  以后都是写mapper
public interface Usermapper {
    //获取全部用户
    List<User> getUserList();
    //根据id查询用户
    User getuserId(int id);
    //插入一个用户
    int addUser(User user);
    //修改用户
    int updataUser(User user);
    //删除一个用过
    int deleUser(int id);
}
