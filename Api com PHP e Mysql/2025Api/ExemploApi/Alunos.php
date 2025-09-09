<?php
// Arquivo que faz o acesso ao banco
require_once 'config.php';

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
        $row = $stm->fetch(PDO::FETCH_ASSOC);  // Usar fetch() com o modo associativo

        if ($row) {
            // Se encontrar o aluno
            var_dump($row);
        } else {
            // Não encontrou o código
            throw new Exception("Código não encontrado");
        }
    }

    public static function buscarTodos() {
        $tabela = "alunos";

        $conexao = new PDO(dbDrive . ':host=' . dbEndereco . '; dbname=' . dbNome, dbUsuario, dbSenha);

        $sql = "SELECT * FROM $tabela";

        // Preparar o comando Select
        $stm = $conexao->prepare($sql);
        
        $stm->execute();

        // Encontrou dados
        if($stm->rowCount() > 0) {
            var_dump($stm->fetch(PDO::FETCH_ASSOC));
        } else {
            // Não encontrou dados na tabela
            throw new Exception("Tabela vazia");
        }
    }

    public static function incluir($dados) {
        $tabela = "alunos";

        $conexao = new PDO(dbDrive . ':host=' . dbEndereco . '; dbname=' . dbNome, dbUsuario, dbSenha);

        $sql = "INSERT INTO $tabela (nome, email, telefone) VALUES (:nome, :email, :telefone)";

        // Preparar o comando Select
        $stm = $conexao->prepare($sql);
        
        $stm->bindValue(':nome', $dados['nome']);
        $stm->bindValue(':email', $dados['email']);
        $stm->bindValue(':telefone', $dados['telefone']);

        $stm->execute();

        // Cadastrou os dados
        if($stm->rowCount() > 0) {
            echo "Dados cadastrados com sucesso";
        } else {
            // Não gravou por algum motivo
            echo "Erro";
        }
    }

    public static function alterar($id, $dados) {
        $tabela = "alunos";

        $conexao = new PDO(dbDrive . ':host=' . dbEndereco . '; dbname=' . dbNome, dbUsuario, dbSenha);

        $sql = "UPDATE $tabela SET nome=:nome, email=:email, telefone=:telefone WHERE codigo = :id";

        // Preparar o comando Select
        $stm = $conexao->prepare($sql);
        
        $stm->bindValue(':nome', $dados['nome']);
        $stm->bindValue(':email', $dados['email']);
        $stm->bindValue(':telefone', $dados['telefone']);
        $stm->bindValue(':id', $id);

        $stm->execute();

        // Alterou os dados
        if($stm->rowCount() > 0) {
            echo "Dados alterados com sucesso";
        } else {
            // Não alteru por algum motivo
            echo "Erro";
        }
    }
}

?>