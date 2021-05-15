
    
create table sp
( sno char(3) not null,
pno char(3) not null,
qty int(3) not null,
PRIMARY KEY(sno, pno),
FOREIGN KEY(sno) REFERENCES s(sno),
FOREIGN KEY(pno) REFERENCES p(pno) );

insert into sp
( sno, pno, qty)
values ("s1", "p1", 300),
("s1", "p2", 200),
("s1", "p3", 400),
("s1", "p5", 100),
("s1", "p6", 100),
("s2", "p1", 300),
("s2", "p2", 400),
("s3", "p2", 200),
("s4", "p2", 200),
("s4", "p4", 300),
("s4", "p5", 400);
    
insert into sp
( sno, pno, qty)
values ("s1", "p4", 200);


select * from sp;