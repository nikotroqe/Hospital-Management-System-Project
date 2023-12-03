package com.project.HospitalManagmentSystem.controller;

import com.project.HospitalManagmentSystem.entity.Staff;
import com.project.HospitalManagmentSystem.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class StaffController {
    @Autowired
    private StaffService staffService;

    //Add Staff
    @GetMapping("/add_doctor")
    public String addDoctor(){
        return "add_doctor";
    }


    //Save to list after adding
    @PostMapping("/save")
    public String addStaff(@ModelAttribute Staff s){
        System.err.println(s);
        staffService.save(s);
        return "redirect:/list_doctor";
    }
    //Edit
    @RequestMapping("/edit_doctor/{id}")
    public String editStaff(@PathVariable("id") int id,Model model) {
        Staff s=staffService.getStaffById(id);
        model.addAttribute("staff",s);
        return "edit_doctor";
    }
    //Delete list
    @RequestMapping("/delete_doctor/{id}")
    public String deleteStaff(@PathVariable("id")int id) {
        staffService.deleteById(id);
        return "redirect:/list_doctor";
    }
    @GetMapping("/list_doctor")
    public String findPaginated(@RequestParam(name = "page",defaultValue = "0") int pagenation1, Model m){
        Page<Staff> stafflist=staffService.getStaffByPagination(pagenation1, 5);
        m.addAttribute("staff", stafflist);
        m.addAttribute("currentPage", pagenation1);
        m.addAttribute("totalPages", stafflist.getTotalPages());
        m.addAttribute("totalItem", stafflist.getTotalElements());
        return "list_doctor";
    }
}
