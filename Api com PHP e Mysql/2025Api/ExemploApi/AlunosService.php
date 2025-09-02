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
}
?>