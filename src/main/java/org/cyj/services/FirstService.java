package org.cyj.services;

import org.cyj.entity.test_user;
import org.cyj.mapper.Test_User_Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FirstService {

    @Resource
    private Test_User_Mapper mapper111;

    public int inserUser(String name,String sex,String age){
        return mapper111.insert(name,sex,age);
    }
    public test_user findUser(String name){
        return mapper111.findByName(name);
    }

}
