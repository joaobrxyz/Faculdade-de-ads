<?php
include_once 'Alunos.php';
class AlunosService {
    
    public function get($id = null) {
        // Se existe $id
        if ($id) {
            // Consultar o aluno pelo código7
            return Alunos::buscarPeloCodigo($id);
        } else {
            // Consultar todos os alunos
            return Alunos::buscarTodos();
        }
    }

    public function post() {
        // Pega os dados em formato JSON para inserir no banco 
        $dados = json_decode(file_get_contents('php://input'), true, 512);
        if ($dados == null) {
            throw new Exception("Falta os dados para incluir.");
        }
        return Alunos::incluir($dados);
    }

    public function put($id = null) {
        if ($id == null) {
            throw new Exception("Falta o código do aluno.");
        }
        $dados = json_decode(file_get_contents('php://input'), true, 512);
        if ($dados == null) {
            throw new Exception("Falta informações.");
        }
        return Alunos::alterar($id, $dados);
    }

    public function delete($id = null) {
        if ($id == null) {
            throw new Exception("Falta o código do aluno.");
        }
        
        return Alunos::deletar($id);
    }
}
?>