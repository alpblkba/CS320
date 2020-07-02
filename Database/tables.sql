CREATE SCHEMA `hms`;

CREATE TABLE hms.Patient
(
  id INT NOT NULL auto_increment,
  p_Tckn VARCHAR(11),
  p_Name VARCHAR(50) NOT NULL,
  email VARCHAR(40) NOT NULL,
  hashpw VARCHAR(50) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE (p_Tckn),
  UNIQUE (email)
);

CREATE TABLE hms.Doctor
(
  id INT NOT NULL auto_increment,
  d_Name VARCHAR(50) NOT NULL,
  email VARCHAR(40) NOT NULL,
  hashpw VARCHAR(50) NOT NULL,
  departmentName VARCHAR(35) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE (email)
);

CREATE TABLE hms.Make_Appointments
(
  id INT NOT NULL auto_increment,
  p_id INT NOT NULL,
  d_id INT NOT NULL,
  checkin_time VARCHAR(5) NOT NULL,
  date VARCHAR(10) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (p_id) REFERENCES Patient(id),
  FOREIGN KEY (d_id) REFERENCES Doctor(id)
);

CREATE TABLE hms.Administrator
(
  id INT NOT NULL auto_increment,
  hashpw VARCHAR(50) NOT NULL,
  email VARCHAR(40) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE (email)
);

ALTER TABLE `hms`.`make_appointments` 
CHANGE COLUMN `checkin_time` `checkin_time` VARCHAR(20) NOT NULL ;


INSERT INTO hms.administrator(hashpw,email) VALUES('541M4Z5A+id1E2vXnnX6Dw==','duduoglu@ozu.edu.tr'); /*
email: duduoglu@ozu.edu.tr
password: 123456
*/
INSERT INTO hms.administrator(hashpw,email) VALUES('wY5hLgeVb+62gDz8hrwaqw==','ozvardar@ozu.edu.tr');/*
email: ozvardar@ozu.edu.tr
password: 123123
*/
INSERT INTO hms.administrator(hashpw,email) VALUES('IRERtiv8onxuNBxkMsu2Gg==','karakuz@ozu.edu.tr');/*
email: karakuz@ozu.edu.tr
password: 123321
*/
