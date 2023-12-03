package com.project.HospitalManagmentSystem.service;

import com.project.HospitalManagmentSystem.entity.Staff;
import com.project.HospitalManagmentSystem.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffRepository sRepo;

    public void save(Staff s){
        sRepo.save(s);
    }
    public List<Staff> getAllStaff(){
        return sRepo.findAll();
    }
    public Staff getStaffById(int id){
        return sRepo.findById(id).get();
    }
    public void deleteById(int id) {
        sRepo.deleteById(id);
    }

    public Page<Staff> getStaffByPagination(int currentPage,int size){
        Pageable p = PageRequest.of(currentPage,size);
        return sRepo.findAll(p);
    }
}
