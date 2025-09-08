<?php
// Necessário para a mesma máquina (localhost)
header("Access-Control-Allow-Origin: *");
// String em PHP no formato JSON
$clientes = '[ {"nome": "Caroline", "sobrenome": "Silva"},
               {"nome": "Cristiane", "sobrenome": "Machado"},
               {"nome": "Julianna", "sobrenome": "Dantas Alves"}
             ]';
// Enviando os dados para a página web
echo $clientes;
?>