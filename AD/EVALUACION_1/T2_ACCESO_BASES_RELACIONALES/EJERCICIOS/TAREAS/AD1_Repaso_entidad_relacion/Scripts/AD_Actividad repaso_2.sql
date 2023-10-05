create database if not exists Actividad2;
use Actividad2;

create table if not exists  cliente(
CodCliente varchar(9) primary key
);

create table if not exists articulo(
CodArticulo int(5) primary key
);

create table compra(
CodCliente varchar(9),
CodArticulo int(5),
Fecha date,
Unidades int,
primary key (CodCliente, CodArticulo),
constraint fk_compra_cliente foreign key (CodCliente) references cliente (CodCliente),
constraint fk_compra_articulo foreign key (CodArticulo) references articulo (CodArticulo)
);

insert into cliente values
('111111111'),
('222222222'),
('333333333');

-- select * from cliente;

insert into articulo values
('44444'),
('55555'),
('66666');

-- select * from articulo;

insert into compra values
('111111111','44444',20000101,1),
('222222222','55555',20000102,2),
('333333333','66666',20000103,3);

-- select * from compra;

