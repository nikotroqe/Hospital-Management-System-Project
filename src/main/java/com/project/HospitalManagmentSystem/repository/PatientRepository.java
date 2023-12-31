package com.project.HospitalManagmentSystem.repository;

import com.project.HospitalManagmentSystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository <Patient, Integer>{
}
