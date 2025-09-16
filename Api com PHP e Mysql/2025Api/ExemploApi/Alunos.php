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
            return ["erro" => false, "mensagem" => "Dados encontrados", "dados" => $row];
        } else {
            // Não encontrou o código
            return ["erro" => true, "mensagem" => "Código não encontrado", "dados" => []];
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
            // var_dump($stm->fetchAll(PDO::FETCH_ASSOC));
            $dados = $stm->fetchAll(PDO::FETCH_ASSOC);
            return ["erro" => false, "mensagem" => "Dados encontrados", "dados" => $dados];
        } else {
            // Não encontrou dados na tabela
            // throw new Exception("Tabela vazia");
            return ["erro" => true, "mensagem" => "Tabela vazia", "dados" => []];
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
            return ["erro" => false, "mensagem" => "Dados adiciionados com sucesso!", "dados" => []];
        } else {
            // Não gravou por algum motivo
            return ["erro" => true, "mensagem" => "Erro ao alterar", "dados" => []];
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
            return ["erro" => false, "mensagem" => "Dados alterados com sucesso!", "dados" => []];
        } else {
            // Não alteru por algum motivo
            return ["erro" => true, "mensagem" => "Erro ao alterar", "dados" => []];
        }
    }

    public static function deletar($id) {
        $tabela = "alunos";

        $conexao = new PDO(dbDrive . ':host=' . dbEndereco . '; dbname=' . dbNome, dbUsuario, dbSenha);

        $sql = "DELETE FROM $tabela WHERE codigo = :id";

        // Preparar o comando Select
        $stm = $conexao->prepare($sql);

        $stm->bindValue(':id', $id);

        $stm->execute();

        // Deletou os dados
        if($stm->rowCount() > 0) {
            // echo "Dados excluídos com sucesso";
            return ["erro" => false, "mensagem" => "Dados excluídos com sucesso", "dados" => []];
        } else {
            // Não deletou por algum motivo
            // echo "Erro";
            return ["erro" => false, "mensagem" => "Código não encontrado", "dados" => []];
        }
    }

}

?>