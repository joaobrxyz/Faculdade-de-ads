-- Alterar a tabela de alunos, adicionando a coluno status do aluno.
alter table alunos add column status varchar(10);

alter table alunos modify column endereco varchar(100);

alter table alunos add column curso varchar(50);
alter table alunos drop column curso;