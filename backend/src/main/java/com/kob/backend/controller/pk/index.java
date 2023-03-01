package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pk/")
public class index {
    @RequestMapping("index/")
    public String  index_sub(){
        return "pk/index.html";
    }
}
