package com.example.django_to_spring.controller;

import com.example.django_to_spring.model.CustomUser;
import com.example.django_to_spring.service.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private CustomUserService customUserService;

    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("user", new CustomUser());
        return "signup";
    }

    @PostMapping("/signup")
    public String signupSubmit(@ModelAttribute CustomUser user) {
        customUserService.saveUser(user);
        return "redirect:/user/login?signup_success=true";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
}
