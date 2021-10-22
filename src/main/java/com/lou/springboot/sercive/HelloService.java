package com.lou.springboot.sercive;

import org.springframework.stereotype.Service;

/**
 * @author Lil
 * @date 2021/10/22 23:14
 */
@Service
public class HelloService {
    public String SayHello(String name) {
        return "hello" + name;
    }
}
