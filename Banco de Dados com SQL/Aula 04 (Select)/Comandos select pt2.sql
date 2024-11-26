select * from funcionarios
where funCodigo = 3 or funCodigo = 5 or funCodigo = 7 or funCodigo = 9;

select * from funcionarios
where funCodigo in (3,5,7,9);

select * from funcionarios
where funCodigo >= 4 and funCodigo <= 8;

select * from funcionarios
where funCodigo between 4 and 8;

select * from funcionarios
where funNome like '%Ma%';

select count(funCodigo) as 'Qtd de Funcionários' from funcionarios;

select count(funCodigo) as 'Qtd de Funcionários',
max(funSalario) as 'Maior Salário',
min(funSalario) as 'Menor Salário',
avg(funSalario) as 'Média de Salário',
sum(funSalario) as 'Soma de todos os Salários'
from funcionarios;

select count(funCodigo) 'Qtd de Funcionários',
funCodFuncao'Função'
from funcionarios
group by funCodFuncao;

select funcionarios.funCodigo 'Código',
funcionarios.funNome 'Funcionário',
funcionarios.funDataAdm 'Data de Admissão',
funcionarios.funSalario 'Salário',
funcionarios.funCodFuncao 'Cod. Função',
funcao.funNome 'Função'
from funcionarios, funcao
where funcionarios.funCodFuncao = funcao.funCodigo;