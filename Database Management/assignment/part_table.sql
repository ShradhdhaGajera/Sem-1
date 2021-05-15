CREATE TABLE p
(
	pno char(3) primary key,
    pname varchar(50) not null,
    color varchar(10) not null,
    weight int(5) not null,
    p_city char(20) not null
);

insert into p
( pno, pname, color, weight, p_city)
values ("p1", "Nut", "Red", 12.0, "London"),
("p2", "Bolt","Green", 17.0, "Paris"),
("p3", "Screw", "Blue", 17.0, "Oslo"),
("p4", "Screw", "Red", 14.0, "London"),
("p5", "Cam", "Blue", 12.0, "Paris"),
("p6", "Cam", "Red", 19.0, "London");

select * from p;