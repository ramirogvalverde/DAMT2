create database if not exists Actividad3;
use Actividad3;

create table if not exists  paciente(
NumHistorial int(9) primary key
);

create table if not exists medico(
CodIdentificacion int(9) primary key
);

create table ingreso(
NumIngreso int(9) primary key,
NumHistorial int(9),
CodIdentificacion int(9),
constraint fk_ingreso_paciente foreign key (NumHistorial) references paciente (NumHistorial),
constraint fk_ingreso_medico foreign key (CodIdentificacion) references medico (CodIdentificacion)
);

insert into paciente values
(111111111),
(222222222),
(333333333);


-- select * from paciente;

insert into medico values
(444444444),
(555555555),
(666666666);

-- select * from medico;

insert into ingreso values
(1212,111111111,444444444),
(2323,222222222,555555555),
(3434,333333333,666666666);

-- select * from ingreso;