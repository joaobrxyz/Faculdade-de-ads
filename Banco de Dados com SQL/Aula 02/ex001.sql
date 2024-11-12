create database faculdade;
use faculdade;

create table alunos (
	id_aluno int auto_increment primary key,
    nome varchar(50) not null,
    cpf int(11) unique not null,
    email varchar(50) not null
);

create table disciplinas (
	id_disciplina int auto_increment primary key,
    nome varchar(50) not null,
    cargahoraria int
);

create table notas (
	id_nota int auto_increment primary key,
	id_aluno int,
    id_disciplina int,
    media float,
    situacao varchar(15) check (situacao in ('Aprovado','Reprovado')),
    constraint fk_nota_aluno foreign key (id_aluno) references alunos (id_aluno),
	constraint fk_nota_disc  foreign key (id_disciplina) references disciplinas (id_disciplina)
);

-- Check é uma validação que permite gravar apenas Aprovado ou Reprovado, qualquer outro valor que tente gravar, o banco de dados irá recusar.

/* criando o relacionamento entre as tabelas notas e alunos
constraint fk_nota_aluno foreign key (idAluno) references ALUNOS (idAluno),
constraint fk_nota_aluno  => está atribuindo um nome para à regra
foreign key => chave estrangeira
(idAluno)    => quem é à chave estrangeira
references ALUNOS (idAluno)   => com qual tabela há o relacionamento, lembrando que o idAluno é à chave primária na tabela de alunos
*/
