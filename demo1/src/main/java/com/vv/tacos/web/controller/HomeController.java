package com.vv.tacos.web.controller;

/**
 * @author wlj
 * @date 2021/09/02 15:17
 **/
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(String aaa) {
        System.out.println("shdksghdkhgks"+ StringUtils.isEmpty(aaa));
        return "home";
    }
}

