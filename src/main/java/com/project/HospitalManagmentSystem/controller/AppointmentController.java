package com.project.HospitalManagmentSystem.controller;

import com.project.HospitalManagmentSystem.entity.Appointment;
import com.project.HospitalManagmentSystem.entity.Patient;
import com.project.HospitalManagmentSystem.entity.Staff;
import com.project.HospitalManagmentSystem.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/add_appointment")
    public String addAppointment(){
        return "add_appointment";
    }

    @PostMapping("/save2")
    public String addAppointment(@ModelAttribute Appointment a){
        System.err.println(a);
        appointmentService.save(a);
        return "redirect:/list_appointment";
    }
    @RequestMapping("/edit_appointment/{id}")
    public String editAppointment(@PathVariable("id") int id,Model model) {
        Appointment a=appointmentService.getAppointmentById(id);
        model.addAttribute("appointment",a);
        return "edit_appointment";
    }
    @RequestMapping("/delete_appointment/{id}")
    public String deleteAppointment(@PathVariable("id")int id) {
        appointmentService.deleteById(id);
        return "redirect:/list_appointment";
    }

    @GetMapping("/list_appointment")
    public String findPaginated(@RequestParam(name = "page",defaultValue = "0") int pagenation3, Model m){
        Page<Appointment> appointmentlist=appointmentService.getAppointmentByPagination(pagenation3, 3);
        m.addAttribute("appointment", appointmentlist);
        m.addAttribute("currentPage", pagenation3);
        m.addAttribute("totalPages", appointmentlist.getTotalPages());
        m.addAttribute("totalItem", appointmentlist.getTotalElements());
        return "list_appointment";
    }
}
