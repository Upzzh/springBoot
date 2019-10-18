package org.zzh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.zzh.model.User;
import org.zzh.service.UserService;

import java.util.concurrent.ConcurrentHashMap;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String  getUser(Model model){
        new ConcurrentHashMap();
        User user =  userService.getUser();
        model.addAttribute("user",user);
        System.out.println(user);
        return "index";
    }
}
