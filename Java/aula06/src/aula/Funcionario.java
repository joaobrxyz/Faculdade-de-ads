package aula;

public abstract class Funcionario {
    public int idade;
    public String nome, setor;

    // Método constructor sem parâmetros
    public Funcionario() {
        this.setIdade(0);
        this.setNome("");
        this.setSetor("");
    }

    // Método constructor com parâmetros
    public Funcionario(int idade, String nome, String setor) {
        this.setIdade(idade);
        this.setNome(nome);
        this.setSetor(setor);
    }

    public abstract void calculaSalario();


    // Gets e sets
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}