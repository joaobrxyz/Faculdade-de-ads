create database aula_consulta;
use aula_consulta;

create table funcao (
	funCodigo int auto_increment primary key,
    funNome varchar(50) not null
);

insert into funcao (funNome) values
	('Gerente de Projeto'),
    ('Analista de Sistemas'),
    ('Programador'),
    ('Estagiário');

update funcao set funNome = 'Desenvolvedor de Software' where funCodigo = 3; 

create table funcionarios (
	funCodigo int primary key auto_increment,
    funNome varchar(50),
    funDataAdm date,
    funSalario float,
    funCodFuncao int,
    constraint fk_func_funcao foreign key (funCodFuncao) references funcao (funCodigo)
);

insert into funcionarios (funNome, funDataAdm, funSalario, funCodFuncao) values
	('Maria', '2003/08/06', 5000, 1),
    ('Francisco', '2000/11/10', 5000, 1),
    ('Aparecida', '2004/06/22', 1500, 2),
    ('Marino', '2005/01/05', 2500, 3),
    ('João', '2005/02/10', 2500, 3),
    ('Mariana', '2005/05/03', 2500, 3),
    ('Luciano', '2005/10/15', 2500, 3),
    ('Fernando', '2005/10/20', 2500, 3),
    ('Marcos', '2006/05/01', 1200, 4),
    ('Luiz', '2006/05/01', 1200, 4);
