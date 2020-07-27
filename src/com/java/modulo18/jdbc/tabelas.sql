create database teste;
use teste;

create table profissao(
    prof_id int auto_increment primary key,
    prof_nome varchar(30)
);

describe profissao;

select * from profissao;

create table funcionario(
    matricula int not null,
    nome varchar(40) not null,
    salario double not null
    
);

describe funcionario;

select * from funcionario;

create table horario(
   data date,
   horas datetime,
   horadiaano timestamp
);

describe horario;

select * from horario;

create table foto(
   imagem blob
);

create database banco;

create table conta(
    numero int auto_increment primary key,
    cliente varchar(50) not null,
    saldo double not null
);

create database contato;

create table agenda(
    codigo int auto_increment primary key,
    nome varchar(50) not null,
    email varchar(50) not null,
    telefone varchar(20) not null
);



