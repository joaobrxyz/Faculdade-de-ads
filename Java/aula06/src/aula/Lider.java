package aula;

public class Lider extends Funcionario {
    String tribo;

    public Lider() {
        super();
        this.setTribo("");
    }

    public Lider(int idade, String nome, String setor, String tribo) {
        super(idade, nome, setor);
        this.setTribo(tribo);
    }

    @Override
    public void calculaSalario() {

    }

    public String getTribo() {
        return tribo;
    }

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }
}
