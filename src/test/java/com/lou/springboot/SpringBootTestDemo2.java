package com.lou.springboot;

import com.lou.springboot.sercive.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Lil
 * @date 2021/10/22 23:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestDemo2 {
    @Autowired
    HelloService helloService = new HelloService();

    @Test
    public void sayHelloTest() {
        System.out.println(helloService.SayHello("廖晓文"));
    }
}
