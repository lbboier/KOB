package com.kob.backend.controller.pk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("bot/")
    public Map<String,String> getBotInfo(){
        Map<String,String> bot1=new HashMap<>();
        bot1.put("name","sanhua");
        bot1.put("power","2333");
        return bot1;
    }
}
