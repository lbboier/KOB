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
    public List<Map<String,String>> getBotInfo(){
        List<Map<String,String>> list_map=new LinkedList<>();
        Map<String,String> bot1=new HashMap<>();
        bot1.put("qiuqiu","sanhua");
        bot1.put("xiaohei","nainiu");
        bot1.put("xiaohuang","sanhua");
        Map<String,String> bot2=new HashMap<>();
        bot2.put("sanhua","qiuqiu");
        bot2.put("nainiu","xiaohei");
        bot2.put("sanhua_two","xiaohuang");
        list_map.add(bot1);
        list_map.add(bot2);
        return list_map;
    }
}
