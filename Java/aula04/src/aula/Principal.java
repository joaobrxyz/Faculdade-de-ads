package aula;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String dados;
        dados = JOptionPane.showInputDialog("Digite o id. da Pessoa: ");

        // Criação dos objetos
        Pessoas obj1 = new Pessoas();
        obj1.setIdPessoa(Integer.parseInt(dados));

        dados = JOptionPane.showInputDialog("Digite o nome da Pessoa: ");
        obj1.setNome(dados);

        dados = JOptionPane.showInputDialog("Digite o email da Pessoa: ");
        obj1.setEmail(dados);

        JOptionPane.showMessageDialog(null, "Dados da Pessoa" +
                "\nId. da Pessoa: " + obj1.getIdPessoa() +
                "\nNome da Pessoa: " + obj1.getNome() +
                "\nEmail da Pessoa: " + obj1.getEmail());

        Alunos obj2 = new Alunos();
        obj2.setIdPessoa(2);
        obj2.setNome("Willian");
        obj2.setEmail("willian@teste.com");
        obj2.setRa(12342022);
        obj2.setCurso("ADS");

        Professores obj3 = new Professores();
        obj3.setIdPessoa(3);
        obj3.setNome("Oscar");
        obj3.setEmail("oscar@teste.com");
        obj3.setIdFuncionario(123);
        obj3.setDisciplinas("Matemática, Física");
    }
}