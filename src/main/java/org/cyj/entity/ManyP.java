package org.cyj.entity;


import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@ToString
public class ManyP {
    @Value("${http}")
    private String http;
    @Value("${name}")
    private String name;


}
