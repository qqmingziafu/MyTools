package org.cyj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/index")
    public String handdle(){
        return "two 启动接口";
    }

}
