package aula;

public class Principal {
    public static void main(String[] args) {
        ContaComum conta1 = new ContaComum();
        conta1.setCpf("123.456.789-00");
        conta1.setNumeroConta(123);
        conta1.setSaldo(1000);
        conta1.setSenha("Senha@123");

        conta1.saque(1200);
        conta1.saque(800);

        ContaEspecial conta2 = new ContaEspecial(456, 1000, "123@Senha", "987.654.321-00", 1000);
        conta2.saque(2500);
        conta2.saque(1200);
    }
}