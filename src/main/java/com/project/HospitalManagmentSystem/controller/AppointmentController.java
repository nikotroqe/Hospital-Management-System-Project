package com.project.HospitalManagmentSystem.controller;

import com.project.HospitalManagmentSystem.entity.Appointment;
import com.project.HospitalManagmentSystem.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @GetMapping("/list_appointment")
    public ModelAndView getAllAppointment(){
        List<Appointment> list=appointmentService.getAllAppointment();
        return new ModelAndView("list_appointment","appointment",list);
    }
    @PostMapping("/save2")
    public String addAppointment(@ModelAttribute Appointment a){
        System.err.println(a);
        appointmentService.save(a);
        return "redirect:/list_appointment";
    }
    @RequestMapping("/delete_appointment/{id}")
    public String deleteAppointment(@PathVariable("id")int id) {
        appointmentService.deleteById(id);
        return "redirect:/list_appointment";
    }
}
