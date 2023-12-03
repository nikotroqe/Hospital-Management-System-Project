package com.project.HospitalManagmentSystem.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
@Controller
public class UserController {
    @PreAuthorize("hasAnyAuthority('USER','ADMIN')")
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @Secured("USER")
    @GetMapping("/user")
    public String user() {
        return "user";
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
    @ModelAttribute("username")
    public String getUsername() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth.getName();
    }
    @GetMapping("/about")
    public String aboutDev(){
        return "about";
    }
    @GetMapping("/logout")
    public String logout(){
        return "logout";
    }

}
