package com.zhang.dao;

import com.zhang.pojo.User;
import com.zhang.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

public class UserDaoTest {

    @Test
    public void test(){
        //获取sqlSession对象

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SqL
        Usermapper mapper = sqlSession.getMapper(Usermapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        //close
        sqlSession.close();
    }
    @Test
    public void getuserId(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Usermapper mapper = sqlSession.getMapper(Usermapper.class);
        User user = mapper.getuserId(1);
        System.out.println(user);
        sqlSession.close();
    }


    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Usermapper mapper = sqlSession.getMapper(Usermapper.class);
        mapper.addUser(new User(4,"张洪刚","123456789"));

        sqlSession.commit();



        sqlSession.close();
    }


    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Usermapper mapper = sqlSession.getMapper(Usermapper.class);
        mapper.updataUser(new User(4,"成绩琪琪","88954"));


        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Usermapper mapper = sqlSession.getMapper(Usermapper.class);
        mapper.deleUser(4);
        sqlSession.commit();
        sqlSession.close();
    }
}
