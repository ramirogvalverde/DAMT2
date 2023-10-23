create database login;
use login;

create table Usuario (
ID int auto_increment primary KEY,
Usuario VARCHAR(30) unique,
Contraseña VARCHAR(50)

);

-- drop table Usuario;