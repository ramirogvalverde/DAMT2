/*Actividad 1:
1- Transforma en el diagrama entidad-relación en un modelo relacional.*/

create database if not exists Actividad1;
use Actividad1;

create table if not exists  empleado(
NIF varchar(9) primary key,
Nombre varchar (20) not null,
FechaNac date
);

create table if not exists departamento(
CodDpto int(5) primary key,
NombreDpto varchar(20) not null,
Presupuesto double(10,2)
);

create table trabaja(
nif_empleado varchar(9),
CodDpto_dpt int(5),
primary key (nif_empleado, CodDpto_dpt),
constraint fk_trabaja_empleado foreign key (nif_empleado) references empleado (NIF),
constraint fk_trabaja_departamento foreign key (CodDpto_dpt) references departamento (CodDpto)
);

insert into empleado values
('00000000N','nombre1',20000101),
('11111111N','nombre2',20000202),
('22222222N','nombre3',20000303);

-- select * from empleado;

insert into departamento values
('00000','nombre4',2000),
('11111','nombre5',2000),
('22222','nombre6',2000);

-- select * from departamento;

insert into trabaja values
('00000000N','00000'),
('11111111N','11111'),
('22222222N','22222');

-- select * from trabaja;


