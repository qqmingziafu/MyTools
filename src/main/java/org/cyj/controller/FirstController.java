package org.cyj.controller;

import org.cyj.entity.test_user;
import org.cyj.services.FirstService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.Main;

import javax.annotation.Resource;

/**
* Description:
* @author:
* @date: 2019/1/20 23:52
*/
/*将这个Controller下面的所有接口设置返回格式json  就不用requestBody了*/
@RestController
public class FirstController {

    @Resource
    private FirstService fs;

    @RequestMapping("/testIndex")
    public String MenthodTest(int i ){

        int j=1/i;

        return "test1";
    }
    @RequestMapping("/insert")
    public int insert(){

        fs.inserUser("小晓","男","15");
        return fs.inserUser("小晓","男","15");
    }

    @RequestMapping("/select")
    public test_user select(){
        System.out.println("11111111111111111111111111111111111111111111111111111");
        test_user t=fs.findUser("小晓");
        return t;
    }

}
