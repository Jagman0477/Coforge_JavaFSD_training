create table patient (
	patient_id varchar(6) PRIMARY KEY,
    p_first_name varchar(15),
    p_middle_name varchar(15),
    p_last_name varchar(15),
	address varchar(30),
    city varchar(15),
    contact_number varchar(10),
    p_age int
    );
    
create table doctor (
	doctor_id varchar(6) PRIMARY KEY,
    dr_first_name varchar(15),
    dr_middle_name varchar(15),
    dr_last_name varchar(15)
    );

create table appointment (
	app_number varchar(6) PRIMARY KEY,
    app_date date,
    app_time varchar(8),
    app_reason varchar(30),
	doctor_id varchar(6),
    patient_id varchar(6),
    FOREIGN KEY (doctor_id) references doctor(doctor_id),
    FOREIGN KEY (patient_id) references patient(patient_id)
    );

create table bill (
	bill_number varchar(6) PRIMARY KEY,
    bill_date date,
    bill_status varchar(8),
    bill_amount int,
	app_number varchar(6),
    FOREIGN KEY (app_number) references appointment(app_number)
    );
    
create table payment (
	payment_id varchar(6) PRIMARY KEY,
    pay_date date,
    pay_mode varchar(10),
    pay_amount int,
	bill_number varchar(6),
    FOREIGN KEY (bill_number) references bill(bill_number)
    );
    
desc patient;
desc doctor;
desc appointment;
desc bill;
desc payment;

select * from patient;
select * from doctor;
select * from appointment;
select * from bill;
select * from payment;

insert into patient values
	(101, 'Arthur', 'Conan', 'Doyle', '123 Aulkland street no - 7', 'Aukland', 0987654321, 57),
    (102, 'Mr.', 'Henry', 'Liyang', '126 Surrie street no - 4', 'Surrie', 1234567890, 25),
    (103, 'Ms.', 'Barry', 'Smith', 'Aparment no-23 Slylander apartments', 'Winnipeg', 6789054321, 34)
	;
    
insert into doctor values
	(567, 'Mr.', 'Stephen', 'Strange'),
    (007, 'Mr.', 'James', 'Bond'),
    (109, 'Ms.', 'Stephenie', 'McMohan')
	;
    
insert into appointment values
	(012, current_date(), current_time(), 'Lung cancer, bone cancer, brain cancer', 007, 102),
    (013, current_date(), current_time(), 'Heart attack, too much cigarette', 109, 103),
    (014, current_date(), current_time(), 'Fever', 007, 101)
	;
insert into bill values
	(001, current_date(), 'Paid', 450000, 012),
    (002, current_date(), 'unpaid', 700000, 013),
    (003, current_date(), 'Paid', 50, 014)
	;
insert into payment values
	(10001, current_date(), 'Online', 450000, 001),
    (10002, current_date(), 'Offline', 0, 002),
    (10003, current_date(), 'Online', 50, 003)
	;
    
-- Query
	select p.patient_id, p.p_first_name, p.p_age, a.app_number, a.app_date from patient p inner join
		appointment a on p.patient_id = a.patient_id and a.app_reason = 'Fever';