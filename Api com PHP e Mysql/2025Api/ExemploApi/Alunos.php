<?php
// Arquivo que faz o acesso ao banco
require_once 'config.php'

class Alunos {
    public static function buscarPeloCodigo($id) {
        $tabela = "alunos";

        $conexao = new PDO(dbDrive . ':host=' . dbEndereco . '; dbname=' . dbNome, dbUsuario, dbSenha);

        $sql = "SELECT * FROM $tabela where codigo = :id";

        // Preparar o comando Select
        $stm = $conexao->prepare($sql);
        
        $stm->bindValue(':id', $id);

        $stm->execute();

        // Encontrou o código procurado
        if($stm->rowCount() > 0) {
            var_dump($stm->fecth(PDO::FETCH_ASSOC));
        } else {
            // Não encontrou o código
            throw new Exception("Código não encontrado");
        }

    }
}

?>