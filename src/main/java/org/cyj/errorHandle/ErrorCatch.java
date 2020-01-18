package org.cyj.errorHandle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages = "org.cyj.controller")
public class ErrorCatch {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> errorJson(Exception e){
        Map<String,Object> res=new HashMap();
        System.out.println(e.getStackTrace());
        System.out.println(e.toString());
        e.printStackTrace();
        res.put("运行时异常！"+e.getMessage(),"全局捕获异常！");
        return res;
    }

}
