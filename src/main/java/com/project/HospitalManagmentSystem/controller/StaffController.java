package com.project.HospitalManagmentSystem.controller;

import com.project.HospitalManagmentSystem.entity.Staff;
import com.project.HospitalManagmentSystem.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StaffController {
    @Autowired
    private StaffService staffService;

    @GetMapping("/add_doctor")
    public String addDoctor(){
        return "add_doctor";
    }

    @GetMapping("/list_doctor")
    public String getAllStaff(Model m){
        return findPaginated(0,m);
    }
    @GetMapping("/list_doctor")
    public ModelAndView getAllStaff(Model m){
        List<Staff>list=staffService.getAllStaff();
        return new ModelAndView("list_doctor","staff",list);
    }

    @PostMapping("/save")
    public String addStaff(@ModelAttribute Staff s){
        System.err.println(s);
        staffService.save(s);
        return "redirect:/list_doctor";
    }
    @RequestMapping("/delete_doctor/{id}")
    public String deleteStaff(@PathVariable("id")int id) {
        staffService.deleteById(id);
        return "redirect:/list_doctor";
    }
    @GetMapping("/page/{pagenation1}")
    public String findPaginated(@PathVariable int pagenation1, Model m){
        Page<Staff> stafflist=staffService.getStaffByPagination(pagenation1, 5);
        m.addAttribute("book", stafflist);
        m.addAttribute("currentPage", pagenation1);
        m.addAttribute("totalPages", stafflist.getTotalPages());
        m.addAttribute("totalItem", stafflist.getTotalElements());
        return "list_doctor";
    }
}
