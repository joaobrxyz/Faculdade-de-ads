CREATE DATABASE projwebservices ;

use projwebservices; 

CREATE TABLE Alunos (
	codigo int PRIMARY KEY AUTO_INCREMENT ,
    nome   varchar(60) NOT NULL	,
    email  varchar(60) NOT NULL	,
    telefone varchar(20) 
);