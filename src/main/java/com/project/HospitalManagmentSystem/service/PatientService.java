package com.project.HospitalManagmentSystem.service;

import com.project.HospitalManagmentSystem.entity.Patient;
import com.project.HospitalManagmentSystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository pRepo;

    public void save(Patient p){
        pRepo.save(p);
    }
    public List<Patient> getAllPatient(){
        return pRepo.findAll();
    }
    public void deleteById(int id) {
        pRepo.deleteById(id);
    }
}
