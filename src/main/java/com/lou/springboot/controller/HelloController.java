package com.lou.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Lil
 * @date 2021/10/22 22:29
 * 全部上传到git
 */

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(String name) {
        return "hello world!" + name;
    }

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("log")
    @ResponseBody
    public String log() {
        logger.info("info级别的的日志");
        logger.error("error级别的的日志");
        logger.debug("debug级别的的日志");
        logger.warn("warn级别的的日志");

        return "日志打印";
    }
}


