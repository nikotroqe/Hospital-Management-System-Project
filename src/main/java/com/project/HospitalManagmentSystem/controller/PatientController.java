package com.project.HospitalManagmentSystem.controller;

import com.project.HospitalManagmentSystem.entity.Patient;
import com.project.HospitalManagmentSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/add_patient")
    public String addPatient(){
        return "add_patient";
    }
    @GetMapping("/list_patient")
    public ModelAndView getAllPatient(){
        List<Patient>list=patientService.getAllPatient();
        return new ModelAndView("list_patient","patient",list);
    }

    @PostMapping("/save1")
    public String addPatient(@ModelAttribute Patient p){
        System.err.println(p);
        patientService.save(p);
        return "redirect:/list_patient";
    }
    @RequestMapping("/delete_patient/{id}")
    public String deletePatient(@PathVariable("id")int id) {
        patientService.deleteById(id);
        return "redirect:/list_patient";
    }

}
