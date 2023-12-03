create table staff(
	id INT AUTO_INCREMENT PRIMARY KEY,
    fname VARCHAR(255),
    lname VARCHAR(255),
    emailaddress VARCHAR(255),
    phonenumber Int,
    birthdate DATE,
    age Int,
    gender VARCHAR(255),
    city VARCHAR(255),
    qualification VARCHAR(255),
    occupation VARCHAR(255)
)

create table patient(
	id INT AUTO_INCREMENT PRIMARY KEY,
    fname VARCHAR(255),
    lname VARCHAR(255),
    emailaddress VARCHAR(255),
    phonenumber Int,
    birthdate DATE,
    age Int,
    gender VARCHAR(255),
    city VARCHAR(255),
    bloodgroup VARCHAR(255)
)
create table appointment(
	id INT AUTO_INCREMENT PRIMARY KEY,
    fullname VARCHAR(255),
    emailaddress VARCHAR(255),
    phonenumber Int,
    diseases VARCHAR(255),
    appointmentdate DATE Time,
    docname VARCHAR(255),
    fulladdress VARCHAR(255)
)