package com.example.springboot.springdataredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shihongwei
 * @date: 2018/11/6 17:45
 * @desc:
 */
public class CacheController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping(value = "/set/{key}/{value}")
    public void set(@PathVariable String key, @PathVariable String value) {
        System.out.println("cache key:" + key);
        System.out.println("cache value:" + value);
        stringRedisTemplate.opsForValue().set(key, value);
    }

    @GetMapping(value = "/get/{key}")
    public String get(@PathVariable String key) {
        System.out.println("fetch key:" + key);
        String value = stringRedisTemplate.opsForValue().get(key);
        System.out.println(value);
        return value;
    }
}
