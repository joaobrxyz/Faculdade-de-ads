package aula;

public class ContaComum {
    int numeroConta;
    float saldo;
    String senha, cpf;

    public ContaComum() {

    }

    public ContaComum(int numeroConta, float saldo, String senha, String cpf) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;
        this.cpf = cpf;
    }

    public void saque(float valor) {
        float saldoAtual = this.getSaldo() - valor;
        if (saldoAtual >= 0) {
            System.out.println("Saldo suficiente para o saque!");
            System.out.println("Saldo anterior: " + this.getSaldo());
            this.setSaldo(saldoAtual);
            System.out.println("Saldo atualizado: " + this.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para o saque!");
            System.out.println("Saldo da conta: " + this.getSaldo());
        }

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
