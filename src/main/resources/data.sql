drop table IF EXISTS kaart;
drop table IF EXISTS student;
drop table IF EXISTS klas;

create table klas(
    id int not null AUTO_INCREMENT,
    naam varchar(3) not null,
    primary key (id)
);

insert into klas(naam)
values ('1PR');
insert into klas(naam)
values ('2PR');
insert into klas(naam)
values ('3PR');

create table student(
    id int not null AUTO_INCREMENT,
    naam varchar(50) not null,
    student_nummer varchar(8) not null,
    klas_id int not null,
    primary key (id),
    foreign key (klas_id) references klas (id)
);

insert into student(naam, student_nummer, klas_id)
values ('Jan Verbeek', 's0140050', 1);
insert into student(naam, student_nummer, klas_id)
values ('Koen Verdonk', 's0185018', 1);
insert into student(naam, student_nummer, klas_id)
values ('Jorn de Houwer', 's5780036', 1);
insert into student(naam, student_nummer, klas_id)
values ('Anne Verlinden', 's0147890', 2);
insert into student(naam, student_nummer, klas_id)
values ('Dylan van Herk', 's0185802', 2);
insert into student(naam, student_nummer, klas_id)
values ('Els Wouters', 's5701436', 2);
insert into student(naam, student_nummer, klas_id)
values ('Gert Verbeemen', 's0120305', 3);
insert into student(naam, student_nummer, klas_id)
values ('Kim Mangelschots', 's6395802', 3);
insert into student(naam, student_nummer, klas_id)
values ('Quinten Verlooy', 's5784526', 3);

create table kaart(
    id int not null AUTO_INCREMENT,
    krediet numeric(8, 2) not null,
    student_id int not null,
    primary key (id),
    foreign key (student_id) references student (id)
);

insert into kaart(krediet, student_id)
values (20.00, 1);
insert into kaart(krediet, student_id)
values (30.80, 2);
insert into kaart(krediet, student_id)
values (14.50, 3);
insert into kaart(krediet, student_id)
values (0.00, 4);
insert into kaart(krediet, student_id)
values (1.20, 5);
insert into kaart(krediet, student_id)
values (27.50, 6);
insert into kaart(krediet, student_id)
values (16.20, 7);
insert into kaart(krediet, student_id)
values (50.00, 8);
insert into kaart(krediet, student_id)
values (5.00, 9);



