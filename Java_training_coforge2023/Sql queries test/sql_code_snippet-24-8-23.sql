-- use helo;
-- create table hloAgain(
-- 	name varchar(256),
--     id int not null primary key,
--     mobile_number int(10) unique
-- );
-- insert into hloAgain values('Jagmanjeet', 1, 1234567890);
-- select * from hloAgain;
-- alter table hloAgain add id varchar(16);
-- drop table hloAgain;

create table IF NOT EXISTS newauthor(
	auth_id varchar(8) NOT NULL,
    auth_name varchar(50) NOT NULL,
    country varchar(25) NOT NULL CHECK (country IN ('USA', 'UK', 'India')),
	home_city varchar(25) NOT NULL,
    PRIMARY KEY(auth_id, home_city)
);

select * from newauthor;

insert into newauthor values(
	13, 'Jags', 'uk', 'Up'
);

select count(*), max(salary), min(salary), avg(salary) from student;