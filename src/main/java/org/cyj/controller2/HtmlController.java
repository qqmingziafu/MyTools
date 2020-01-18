package org.cyj.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

    @RequestMapping("/1")
    public String html1(){
        return "2.html";
    }

    @RequestMapping("/2")
    public String html2(){
        return "/html/2";
    }
}
