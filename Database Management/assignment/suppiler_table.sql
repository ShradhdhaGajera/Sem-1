CREATE DATABASE db1;


CREATE TABLE s (
sno char(3) primary key,
sname varchar(50) not null,
s_status int not null,
s_city varchar(25) not null);


insert into s
( sno, sname, s_status, s_city)
values ("S1", "Smith", 20, "London"),
("S2", "Jones", 10, "Paris"),
("S3", "Blake", 10, "Paris"),
("S4", "Clark", 20, "London"),
("S5", "Adams", 30, "Athens");

select * from s;

