package com.project.HospitalManagmentSystem.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fname;
    private String lname;
    private String emailaddress;
    private Long phonenumber;
    private LocalDate birthdate;
    private Long age;
    private String gender;
    private String city;
    private String bloodgroup;

    public Patient(Integer id, String fname, String lname, String emailaddress, Long phonenumber, LocalDate birthdate,Long age, String gender,String city, String bloodgroup) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.emailaddress = emailaddress;
        this.phonenumber = phonenumber;
        this.birthdate = birthdate;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.bloodgroup = bloodgroup;
    }

    public Patient() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", emailaddress='" + emailaddress + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", birthdate=" + birthdate +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", bloodgroup='" + bloodgroup + '\'' +
                '}';
    }
}
