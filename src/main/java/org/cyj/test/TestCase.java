package org.cyj.test;

import lombok.extern.slf4j.Slf4j;
import org.cyj.entity.LombakEntity;
import org.cyj.entity.ManyP;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

@Slf4j
public class TestCase {


    @org.junit.Test
    public void test1(){
        LombakEntity lom=new LombakEntity();
        lom.setName("你好");
        log.info(lom.toString());
    }

    @org.junit.Test
    public void test2(){
        ManyP m=new ManyP();
        System.out.println(m.toString());
    }
}
