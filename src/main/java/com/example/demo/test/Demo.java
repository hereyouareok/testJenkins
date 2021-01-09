package com.example.demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanQin
 * @version v1.0.0
 * @Description :
 * @Create on : 2021/1/9 14:07
 **/
@RestController
@RequestMapping(value = "/test")
public class Demo {
    @GetMapping(value = "/jenkins")
    public String jenkins(){
        return "jenkins.......";
    }
}
