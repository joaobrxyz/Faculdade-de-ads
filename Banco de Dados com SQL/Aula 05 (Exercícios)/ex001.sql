create database BD_Exercicios;
use BD_Exercicios;

create table autores (
	id_autor int auto_increment primary key,
    nome varchar(50)
);

create table editora (
	id_editora int auto_increment primary key,
    nome varchar(50),
    cnpj varchar(20),
    endereco varchar(50)
);

create table livros (
	isbn varchar(20) primary key,
    nome varchar(50),
    num_paginas int,
    edicao int,
    genero varchar(20),
    id_autor int,
    id_editora int,
    constraint fk_autor foreign key (id_autor) references autores (id_autor),
    constraint fk_editora foreign key (id_editora) references editora (id_editora)
);

alter table livros add column (ano int);

insert into autores (nome) values 
("Machado de Assis"),
("Abel Ferreira"),
("Monteiro Lobato");

insert into editora (nome, cnpj, endereco) values 
(
	"Amazon",
	"07.921.601/0001-86",
	"Cajamar, SP"
),
(
	"Saraiva",
	"61.365.284/0001-04",
	"São Paulo, SP"
);

insert into livros values
(
	'6599096387',
    'Cabeça fria, coração quente',
     408,
     1,
    'Futebol',
     2,
     1,
     2022
),
(
	'8595201390',
    'O Sitio do Pica-pau Amarelo',
     16,
     1,
    'Infantil',
     3,
     1,
     2023
),
(
	'6585310128',
    'Pinóquio',
     192,
     2,
    'Infantil',
     3,
     1,
     2021
),
(
	'856356093X',
    'O Alienista',
     104,
     1,
    'Ficção Literária',
     1,
     2,
     2014
),
(
	'859431860X',
    'Dom Casmurro',
     208,
     3,
    'Ficção Literária',
     1,
     2,
     2019
),
(
	'6555526319',
    'Bons dias',
     96,
     1,
    'Ficção Literária',
     1,
     2,
     2021
);

select isbn, nome 'Nome', num_paginas as 'Número de páginas', edicao 'Edição', genero 'Gênero', id_autor, id_editora, ano from livros
order by nome;

select livros.isbn, livros.nome 'Nome do livro', autores.nome 'Nome do autor', editora.nome 'Nome da editora', livros.edicao 'Edição', livros.ano
from livros, autores, editora
where livros.id_autor = autores.id_autor and livros.id_editora = editora.id_editora;

update livros set edicao = 3 where isbn = '8595201390';

delete from livros where isbn = '8595201390';