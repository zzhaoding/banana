package pers.zhaoding.banana.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banana")
public class BananaController {

    @RequestMapping("get")
    public String getBanana(){
        System.out.println("111");
        return "banana";
    }
}
