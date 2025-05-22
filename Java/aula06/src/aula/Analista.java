package aula;

public class Analista extends Funcionario {
    String funcao;
    String squad;

    public Analista() {

    }

    public Analista(int idade, String nome, String setor, String funcao, String squad) {
        super(idade, nome, setor);
        this.funcao = funcao;
        this.squad = squad;
    }

    @Override
    public void calculaSalario() {

    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }
}
