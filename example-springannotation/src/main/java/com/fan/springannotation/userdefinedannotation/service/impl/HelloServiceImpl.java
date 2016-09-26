package com.fan.springannotation.userdefinedannotation.service.impl;

import com.fan.springannotation.userdefinedannotation.annotation.RpcService;
import com.fan.springannotation.userdefinedannotation.service.HelloService;


@RpcService("HelloService")
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "Hello! " + name;
    }
    
    public void test(){
    	System.out.println("test");
    }
}
