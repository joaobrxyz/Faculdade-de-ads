<?php
    // Criamos a conexão com Banco de dados usando a linguagem PHP:
    // Cria variaveis para armazenar informações digitadas pelo usuario
    $nome  = $_REQUEST["txtnome"] ;
    $idade = $_REQUEST["txtidade"] ;
    $email = $_REQUEST["txtemail"] ;

    // Cria varivaies contendo informações sobre o banco de dados
    // se porta de acesso não for padrão: "localhost:número da porta"
    $endereco = "localhost" ; 
    $usuario  = "root" ;
    $senha    = "" ; // sem senha
    $banco    = "aulaweb" ;

    // Cria a conexao com o banco de dados
    $conexao  = mysqli_connect( $endereco, $usuario, $senha, $banco ) ;

    // cria a variavel com o comando para inserir no banco
    $sql =  "INSERT INTO alunos (nome,idade,email) values('$nome',$idade,'$email')" ;

    //Executa o comando de inserir
    $resultado  = mysqli_query( $conexao , $sql ) ;

    if ( $resultado > 0 ) {
        echo "Dados gravados com sucesso!!!" ;
    }else{
        echo "Erro ao gravar" ;
    }

?>