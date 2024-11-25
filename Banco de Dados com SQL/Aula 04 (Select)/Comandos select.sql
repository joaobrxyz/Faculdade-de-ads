select fucCodigo, fucNome from funcao;

select fucNome, fucCodigo from funcao;

select * from funcao;

select * from funcao order by fucNome;

select fucCodigo as 'Código', fucNome as 'Nome' from funcao order by nome;

select fucCodigo as 'Código', fucNome as 'Nome' from funcao order by nome desc;

select  funCodigo as 'Código', funNome as 'Nome', funSalario as 'Salário' 
from funcionarios order by funSalario, nome;

select * from funcionarios order by funDataAdm desc;

select * from funcionarios 
where funSalario <= 2500;

select * from funcionarios 
where funSalario <> 2500;