package com.project.HospitalManagmentSystem.repository;


import com.project.HospitalManagmentSystem.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffRepository extends JpaRepository <Staff, Integer>{

}
