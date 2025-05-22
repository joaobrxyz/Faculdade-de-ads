package aula;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        // Criando o objeto da classe Funcionario
        // Funcionario fun1 = new Funcionario();
        // erro: cannot instantiate the type Funcionario

        // Criando o objeto da classe Lider
        Lider func2 = new Lider(30, "Alisson", "Desenvolvimento", "Nerd");
        consultaLider(func2);

        // Criando o objeto da classe Analista
        Analista func3 = new Analista(34, "Deyverson", "Desenvolvimento", "Gerente", "Mestre");
        consultaAnalista(func3);


    }
    public static void consultaLider(Lider funcionario) {
        String msg = "Dados do Líder: \n";
        msg += "Idade: " + funcionario.getIdade() + "\n";
        msg += "Nome: " + funcionario.getNome() + "\n";
        msg += "Setor: " + funcionario.getSetor() + "\n";
        msg += "Tribo: " + funcionario.getTribo() + "\n";

        JOptionPane.showMessageDialog(null, msg);
    }
    public static void consultaAnalista(Analista funcionario) {
        String msg = "Dados do Líder: \n";
        msg += "Idade: " + funcionario.getIdade() + "\n";
        msg += "Nome: " + funcionario.getNome() + "\n";
        msg += "Setor: " + funcionario.getSetor() + "\n";
        msg += "Função: " + funcionario.getFuncao() + "\n";
        msg += "Squad: " + funcionario.getSquad() + "\n";

        JOptionPane.showMessageDialog(null, msg);
    }
}
