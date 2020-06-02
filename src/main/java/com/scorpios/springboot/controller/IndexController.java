package com.scorpios.springboot.controller;


import com.scorpios.springboot.common.CommonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index/user")
public class IndexController {

    @PostMapping("/login")
    public CommonResponse login(){
        return CommonResponse.ok().data("token","admin");
    }

    @GetMapping("/info")
    public CommonResponse info(){
        return CommonResponse.ok()
                .data("roles","[admin]")
                .data("name","admin")
                .data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}
