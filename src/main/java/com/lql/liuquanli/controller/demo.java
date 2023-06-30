package com.lql.liuquanli.controller;

import com.lql.liuquanli.conf.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class demo {

    @Resource(name = "redisTemplate")
    private RedisUtil redisUtil;

    @GetMapping("/test")
    public String getTest(){
        //test
        String lql = redisUtil.getValue("lql").toString();
        return lql;
    }

}
