package com.project.HospitalManagmentSystem.service;

import com.project.HospitalManagmentSystem.entity.Appointment;
import com.project.HospitalManagmentSystem.entity.Staff;
import com.project.HospitalManagmentSystem.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository aRepo;
    public void save(Appointment a){
        aRepo.save(a);
    }
    public List<Appointment> getAllAppointment(){
        return aRepo.findAll();
    }
    public Appointment getAppointmentById(int id){
        return aRepo.findById(id).get();
    }
    public void deleteById(int id) {
        aRepo.deleteById(id);
    }

    public Page<Appointment> getAppointmentByPagination(int currentPage, int size){
        Pageable p = PageRequest.of(currentPage,size);
        return aRepo.findAll(p);
    }
}
