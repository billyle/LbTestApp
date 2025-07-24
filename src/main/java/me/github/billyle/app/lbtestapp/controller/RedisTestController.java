package me.github.billyle.app.lbtestapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisTestController {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/set")
    public String setValue(@RequestParam String key, @RequestParam String value) {
        long count = redisTemplate.opsForValue().increment("123");

        redisTemplate.opsForValue().set(key, value);
        return "Key-Value设置成功";
    }

    @GetMapping("/get")
    public String getValue(@RequestParam String key) {
        Object value = redisTemplate.opsForValue().get(key);
        return value != null ? value.toString() : "Key不存在";
    }

    @GetMapping("/del")
    public String deleteKey(@RequestParam String key) {
        Boolean deleted = redisTemplate.delete(key);
        return deleted ? "删除成功" : "删除失败";
    }
}