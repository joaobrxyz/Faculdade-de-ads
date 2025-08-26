<?php
    // O comando echo mostra na tela
    echo (@$_GET['url']);
    
    echo("<br>");
    if(@$_GET['url']) {
        $url = explode('/', $_GET['url']);

        // O comando var_dump mostra na tela o vetor $url
        var_dump($url);

        if($url[0] === 'api') {

        } else {
            echo("Endpoint incorreto");
        }

    } else {
        echo("Endpoint incorreto");
    }
?>