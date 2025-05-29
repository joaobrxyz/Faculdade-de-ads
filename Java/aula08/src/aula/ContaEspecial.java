package aula;

public class ContaEspecial extends ContaComum {
    float limite;

    public ContaEspecial() {

    }

    public ContaEspecial(int numeroConta, float saldo, String senha, String cpf, float limite) {
        super(numeroConta, saldo, senha, cpf);
        this.limite = limite;
    }

    @Override
    public void saque(float valor) {
        float saldoAtual = this.getSaldo() + this.getLimite() - valor;
        if (saldoAtual >= 0) {
            System.out.println("Saldo suficiente para o saque!");
            System.out.println("Saldo anterior: " + this.getSaldo());
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saldo atualizado: " + this.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para o saque!");
            System.out.println("Saldo da conta: " + this.getSaldo());
            System.out.println("Limite da conta: " + this.getLimite());
        }

    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}
