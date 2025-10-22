<?php
    include_once 'AlunosService.php';
    include_once 'util.php';

    header("Access-Control-Allow-Origin: *"); // Necessário Localhost
    header( "Content-Type: application/json; charset=UTF-8 " ) ;
    header( "Access-Control-Allow-Methods: GET,POST,PUT,DELETE" ) ;
    header( "Access-Control: no-cache, no-store, must-revalidate" ) ;
    header( "Access-Control-Allow-Headers: *" ) ;
    header( "Access-Control-Max-Age: 86400" ) ;

    // O comando echo mostra na tela
    // echo (@$_GET['url']);
    
    // echo("<br>");
    if(@$_GET['url']) {
        $url = explode('/', $_GET['url']);

        // O comando var_dump mostra na tela o vetor $url
        // var_dump($url);

        if($url[0] === 'api') {
            // Remove a primeira posição do vetor
            array_shift($url);
            
            // ucfirst() --> Converte a primeira letra em maiúsculo
            $service = ucfirst($url[0]) . "Service";

            $method = $_SERVER["REQUEST_METHOD"];

            // echo "Serviço: " . $service;
            // echo ("<br>");
            // echo "Método: " . $method;

            array_shift($url);

            try {
                // Chamar a classe(arquivo) responsável pelo serviço
                $response = call_user_func_array(array(new $service, $method), $url);
                http_response_code(200);
                // echo $response;
                echo FormatarMensagemJson($response["erro"], $response["mensagem"], $response["dados"]);
                
            } catch (Exception $erro) {
                http_response_code(500);
                echo "<br>ERRO NA API - " . $erro->getMessage();
                echo FormatarMensagemJson(true, $erro->getMessage, []);
            }

        } else {
            echo("Endpoint incorreto");
        }

    } else {
        echo("Endpoint incorreto");
    }
?>