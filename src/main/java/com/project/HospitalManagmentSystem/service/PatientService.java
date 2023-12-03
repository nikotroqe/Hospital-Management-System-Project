package com.project.HospitalManagmentSystem.service;

import com.project.HospitalManagmentSystem.entity.Patient;
import com.project.HospitalManagmentSystem.entity.Staff;
import com.project.HospitalManagmentSystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    public Patient getPatientById(int id){
        return pRepo.findById(id).get();
    }
    public void deleteById(int id) {
        pRepo.deleteById(id);
    }
    public Page<Patient> getPatientByPagination(int currentPage, int size){
        Pageable p = PageRequest.of(currentPage,size);
        return pRepo.findAll(p);
    }
}
