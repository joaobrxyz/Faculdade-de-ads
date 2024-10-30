create database web;

use web;

create table alunos (
	codigo int not null auto_increment primary key,
	nome varchar(50),
    idade int,
    email varchar(50),
    senha varchar(20)
) default charset = utf8;

select * from alunos;