package com.project.HospitalManagmentSystem.service;

import com.project.HospitalManagmentSystem.entity.Appointment;
import com.project.HospitalManagmentSystem.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public void deleteById(int id) {
        aRepo.deleteById(id);
    }
}
