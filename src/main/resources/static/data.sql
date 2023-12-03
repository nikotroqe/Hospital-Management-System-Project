use hospital_db;

INSERT INTO staff (id, fname , lname , emailaddress , phonenumber , birthdate , age , gender , city , qualification , occupation)
VALUES (1, 'Adrian', 'Bajrami', 'adrian.bajrami@spital.com', 355692345678, '1985-01-01', 38, 'Mashkull', 'Tiranë', 'Mjek', 'Kirurg'),
 (2, 'Blerta', 'Kadriu', 'blerta.kadriu@spital.com', 355672345678, '1986-02-02', 37, 'Femër', 'Tiranë', 'Mjek', 'Kardiologe'),
 (3, 'Dritan', 'Leka', 'dritan.leka@spital.com', 355682345678, '1987-03-03', 36, 'Mashkull', 'Tiranë', 'Mjek', 'Neurolog'),
 (4, 'Elsa', 'Rexha', 'elsa.rexha@spital.com', 355662345678, '1988-04-04', 35, 'Femër', 'Tiranë', 'Mjek', 'Dermatologe'),
 (5, 'Fatmir', 'Kola', 'fatmir.kola@spital.com', 355652345678, '1989-05-05', 34, 'Mashkull', 'Tiranë', 'Mjek', 'Ortoped'),
 (6, 'Gerta', 'Marku', 'gerta.marku@spital.com', 355642345678, '1990-06-06', 33, 'Femër', 'Tiranë', 'Mjek', 'Endokrinologe'),
 (7, 'Hamdi', 'Dervishi', 'hamdi.dervishi@spital.com', 355632345678, '1991-07-07', 32, 'Mashkull', 'Tiranë', 'Mjek', 'Psikiatër'),
 (8, 'Ina', 'Zeneli', 'ina.zeneli@spital.com', 355622345678, '1992-08-08', 31, 'Femër', 'Tiranë', 'Mjek', 'Oftalmologe'),
 (9, 'Joni', 'Saliu', 'joni.saliu@spital.com', 355612345678, '1993-09-09', 30, 'Mashkull', 'Tiranë', 'Mjek', 'Otorinolaringolog'),
 (10, 'Klara', 'Hoxha', 'klara.hoxha@spital.com', 355602345678, '1994-10-10', 29, 'Femër', 'Tiranë', 'Mjek', 'Gjinekologe'),
 (11, 'Luan', 'Rama', 'luan.rama@spital.com', 355592345678, '1995-11-11', 28, 'Mashkull', 'Tiranë', 'Infermier', 'Kujdestar'),
 (12, 'Mira', 'Çela', 'mira.cela@spital.com', 355582345678, '1996-12-12', 27, 'Femër', 'Tiranë', 'Infermiere', 'Kujdestare'),
 (13, 'Nik', 'Kurti', 'nik.kurti@spital.com', 355572345678, '1997-01-13', 26, 'Mashkull', 'Tiranë', 'Infermier', 'Kujdestar'),
 (14, 'Olsa', 'Gjoni', 'ornela.gjoni@spital.com', 355562345678, '1998-02-14', 25, 'Femër', 'Tiranë', 'Infermiere', 'Kujdestare'),
 (15, 'Petrit', 'Basha', 'petrit.basha@spital.com', 355552345678, '1999-03-15', 24, 'Mashkull', 'Tiranë', 'Infermier', 'Kujdestar'),
 (16, 'Rina', 'Kasapi', 'rina.kasapi@spital.com', 355542345678, '2000-04-16', 23, 'Femër', 'Tiranë', 'Infermiere', 'Kujdestare'),
 (17, 'Saimir', 'Duka', 'saimir.duka@spital.com', 355532345678, '2001-05-17', 22, 'Mashkull', 'Tiranë', 'Farmacist', 'Menaxher i barnave'),
 (18, 'Teuta', 'Leka', 'teuta.leka@spital.com', 355522345678, '2002-06-18', 21, 'Femër', 'Tiranë', 'Farmaciste', 'Menaxhere e barnave'),
 (19, 'Valon', 'Rexha', 'valon.rexha@spital.com', 355512345678, '2003-07-19', 20, 'Mashkull', 'Tiranë', 'Laborant', 'Analist i mostrave'),
 (20, 'Zana', 'Kadriu', 'zana.kadriu@spital.com', 355502345678, '2004-08-20', 19, 'Femër', 'Tiranë', 'Laborante', 'Analiste e mostrave')

INSERT INTO Patient (id, fname, lname, emailaddress, phonenumber, birthdate, age, gender, city, bloodgroup)
VALUES (1, 'Arben', 'Kola', 'arben.kola@gmail.com', 355692345678, '1990-01-15', 33, 'Male', 'Tirana', 'A+'),
(2, 'Ermira', 'Gjoni', 'ermira.gjoni@yahoo.com', 355672345678, '1992-05-23', 31, 'Female', 'Durrës', 'B-'),
(3, 'Florin', 'Rama', 'florin.rama@hotmail.com', 355682345678, '1989-09-12', 34, 'Male', 'Elbasan', 'AB+'),
(4, 'Genta', 'Leka', 'genta.leka@outlook.com', 355692345678, '1991-03-07', 32, 'Female', 'Shkodër', 'O-'),
(5, 'Ilir', 'Berisha', 'ilir.berisha@gmail.com', 355672345678, '1990-07-19', 33, 'Male', 'Fier', 'A-'),
(6, 'Jona', 'Çela', 'jona.cela@yahoo.com', 355682345678, '1993-11-04', 30, 'Female', 'Korçë', 'B+'),
(7, 'Klajdi', 'Marku', 'klajdi.marku@hotmail.com', 355692345678, '1988-12-25', 35, 'Male', 'Vlorë', 'AB-'),
(8, 'Linda', 'Zogu', 'linda.zogu@outlook.com', 355672345678, '1992-06-14', 31, 'Female', 'Gjirokastër', 'O+'),
(9, 'Marsel', 'Hoxha','marsel.hoxha@gmail.com', 355682345678, '1991-02-28', 32, 'Male', 'Berat', 'A+'),
(10, 'Nora', 'Dervishi', 'nora.dervishi@yahoo.com', 355692345678, '1990-08-31', 33, 'Female', 'Lushnjë', 'B-'),
(11, 'Orion', 'Kurti', 'orion.kurti@hotmail.com', 355672345678, '1989-10-10', 34, 'Male', 'Sarandë', 'AB+'),
(12, 'Rezarta', 'Mema', 'rezarta.mema@outlook.com', 355682345678, '1993-04-16', 30, 'Female', 'Lezhë', 'O-'),
(13, 'Saimir', 'Kadriu', 'saimir.kadriu@gmail.com', 355692345678, '1990-01-01', 33, 'Male', 'Pogradec', 'A-'),
(14, 'Teuta', 'Basha', 'teuta.basha@yahoo.com', 355672345678, '1992-07-07', 31, 'Female', 'Kukës', 'B+'),
(15, 'Xhulio', 'Rexhepi', 'xhulio.rexhepi@hotmail.com', 355682345678, '1988-11-11', 35, 'Male', 'Tropojë', 'AB-')

 INSERT INTO Appointment (id, fullname, emailaddress, phonenumber, diseases, appointmentdate, docname, fulladdress)
 VALUES (1, 'Arben Kola', 'arben.kola@gmail.com', 355692345678, 'Diabetes, Hypertension', '2023-11-10 09:00:00', 'Dr. Ermira Gjoni', 'Rruga e Kavajës, Nr. 15, Tirana'),
 (2, 'Ermira Gjoni', 'ermira.gjoni@yahoo.com', 355672345678, 'Asthma, Allergy', '2023-11-11 10:00:00', 'Dr. Florin Rama', 'Bulevardi Zogu I, Nr. 23, Durrës'),
 (3, 'Florin Rama', 'florin.rama@hotmail.com', 355682345678, 'Arthritis, Migraine', '2023-11-12 11:00:00', 'Dr. Genta Leka', 'Rruga e Elbasanit, Nr. 34, Elbasan'),
 (4, 'Genta Leka', 'genta.leka@outlook.com', 355692345678, 'Anemia, Depression', '2023-11-13 12:00:00', 'Dr. Ilir Berisha', 'Rruga e Skënderbeut, Nr. 45, Shkodër'),
 (5, 'Ilir Berisha', 'ilir.berisha@gmail.com', 355672345678, 'Cancer, Anxiety', '2023-11-14 13:00:00', 'Dr. Jona Çela', 'Rruga e Fierit, Nr. 56, Fier')