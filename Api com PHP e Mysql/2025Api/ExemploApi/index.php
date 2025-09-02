<?php
    // O comando echo mostra na tela
    echo (@$_GET['url']);
    
    echo("<br>");
    if(@$_GET['url']) {
        $url = explode('/', $_GET['url']);

        // O comando var_dump mostra na tela o vetor $url
        var_dump($url);

        if($url[0] === 'api') {
            // Remove a primeira posição do vetor
            array_shift($url);
            
            // ucfirst() --> Converte a primeira letra em maiúsculo
            $service = ucfirst($url[0]) . "Service";

            $method = $_SERVER["REQUEST_METHOD"];

            echo "Serviço: " . $service;
            echo ("<br>");
            echo "Método: " . $method;

            array_shift($url);

            try {
                // Chamar a classe(arquivo) responsável pelo serviço
                $response = call_user_func_array(array(new $service, $method), $url);
                http_response_code(200);
                echo $response;
                
            } catch (Exception $erro) {
                http_response_code(500);
                echo "ERRO NA API";
            }

        } else {
            echo("Endpoint incorreto");
        }

    } else {
        echo("Endpoint incorreto");
    }
?>