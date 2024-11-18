insert into alunos (nome, cpf, email) values(
	'Estevão', '45292164359', 'estevao@gmail.com'
);
select * from alunos;

INSERT INTO disciplinas (nome, cargahoraria, ementa) VALUES (
'Banco de Dados com SQL', 60, 'Introdução ao banco de dados, modelagem de dados e comandos DDL e DCL da linguagem SQL'
);
select * from disciplinas;

INSERT INTO notas (id_aluno, id_disciplina, media, situacao) VALUES (1, 1, 10, 'Aprovado');
INSERT INTO notas (id_aluno, id_disciplina, media, situacao) VALUES (2, 1, 9.5, 'Aprovado');
select * from notas;

update notas set media = 7 where id_aluno = 2;

delete from disciplinas where id_disciplina