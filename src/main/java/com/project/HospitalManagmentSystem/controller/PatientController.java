package com.project.HospitalManagmentSystem.controller;

import com.project.HospitalManagmentSystem.entity.Patient;
import com.project.HospitalManagmentSystem.entity.Staff;
import com.project.HospitalManagmentSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @PostMapping("/save1")
    public String addPatient(@ModelAttribute Patient p){
        System.err.println(p);
        patientService.save(p);
        return "redirect:/list_patient";
    }
    @RequestMapping("/edit_patient/{id}")
    public String editPatient(@PathVariable("id") int id,Model model) {
        Patient p=patientService.getPatientById(id);
        model.addAttribute("patient",p);
        return "edit_patient";
    }
    @RequestMapping("/delete_patient/{id}")
    public String deletePatient(@PathVariable("id")int id) {
        patientService.deleteById(id);
        return "redirect:/list_patient";
    }
    @GetMapping("/list_patient")
    public String findPaginated(@RequestParam(name = "page",defaultValue = "0") int pagenation2, Model m){
        Page<Patient> patientlist=patientService.getPatientByPagination(pagenation2, 5);
        m.addAttribute("patient", patientlist);
        m.addAttribute("currentPage", pagenation2);
        m.addAttribute("totalPages", patientlist.getTotalPages());
        m.addAttribute("totalItem", patientlist.getTotalElements());
        return "list_patient";
    }

}
