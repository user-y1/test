package com.sfes.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/common")
public class CommonController {

    @PostMapping("/file")
    public String upload(MultipartFile file){
        System.out.println(file);
        int a = 1;//测试
        return "123";
    }

    @GetMapping()
    public String test(){
        return "hello world";
    }

    @GetMapping()
    public String test1(){
        return "hello world";
    }

}
