package me.github.billyle.app.lbtestapp.controller;

import me.github.billyle.app.lbtestapp.model.TestUser;
import me.github.billyle.app.lbtestapp.repository.TestUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    
    @Autowired
    private TestUserRepository testUserRepository;
    
    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello, this is a test endpoint!";
    }
    
    @GetMapping("/test/alluser")
    @ResponseBody
    public List<TestUser> getAllUsers() {
        return testUserRepository.findAll();
    }
}