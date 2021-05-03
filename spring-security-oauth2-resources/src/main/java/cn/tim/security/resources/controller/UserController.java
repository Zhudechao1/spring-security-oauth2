package cn.tim.security.resources.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String index(){
        return "{\n" +
                "    \"people\":[\n" +
                "        {\n" +
                "            \"firstName\":\"Brett\",\n" +
                "            \"lastName\":\"McLaughlin\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"firstName\":\"Jason\",\n" +
                "            \"lastName\":\"Hunter\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
}


