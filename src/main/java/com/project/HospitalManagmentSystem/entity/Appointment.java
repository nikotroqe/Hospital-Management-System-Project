package com.project.HospitalManagmentSystem.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Appointment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String fullname;
        private String emailaddress;
        private Long phonenumber;
        private String diseases;
        private LocalDateTime appointmentdate;
        private String docname;
        private String fulladdress;

        public Appointment(Integer id, String fullname, String emailaddress, Long phonenumber,String diseases, LocalDateTime appointmentdate, String docname, String fulladdress) {
                super();
                this.id = id;
                this.fullname = fullname;
                this.emailaddress = emailaddress;
                this.phonenumber = phonenumber;
                this.diseases = diseases;
                this.appointmentdate = appointmentdate;
                this.docname = docname;
                this.fulladdress = fulladdress;
        }

        public Appointment() {
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getFullname() {
                return fullname;
        }

        public void setFullname(String fullname) {
                this.fullname = fullname;
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

        public String getDiseases() {
                return diseases;
        }

        public void setDiseases(String diseases) {
                this.diseases = diseases;
        }

        public LocalDateTime getAppointmentdate() {
                return appointmentdate;
        }

        public void setAppointmentdate(LocalDateTime appointmentdate) {
                this.appointmentdate = appointmentdate;
        }

        public String getDocname() {
                return docname;
        }

        public void setDocname(String docname) {
                this.docname = docname;
        }

        public String getFulladdress() {
                return fulladdress;
        }

        public void setFulladdress(String fulladdress) {
                this.fulladdress = fulladdress;
        }

        @Override
        public String toString() {
            return "Appointment{" +
                    "id=" + id +
                    ", fullname='" + fullname + '\'' +
                    ", emailaddress='" + emailaddress + '\'' +
                    ", phonenumber='" + phonenumber + '\'' +
                    ", diseases='" + diseases + '\'' +
                    ", appointmentdate=" + appointmentdate +
                    ", docname='" + docname + '\'' +
                    ", fulladdress='" + fulladdress + '\'' +
                    '}';
        }
}
