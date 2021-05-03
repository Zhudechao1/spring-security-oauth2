package cn.tim.security.resother.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contents")
public class IndexController {

    @GetMapping
    public String index(){
        return "{\n" +
                "    \"sites\": [\n" +
                "    { \"name\":\"菜鸟教程\" , \"url\":\"www.runoob.com\" }, \n" +
                "    { \"name\":\"google\" , \"url\":\"www.google.com\" }, \n" +
                "    { \"name\":\"微博\" , \"url\":\"www.weibo.com\" }\n" +
                "    ]\n" +
                "}";
    }
}
