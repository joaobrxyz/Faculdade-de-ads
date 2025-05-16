package aula;

public class Principal {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes();
        cliente1.consultarDados();

        Clientes cliente2 = new Clientes(1, "Lúcio", "(11)91234-5678");
        cliente2.consultarDados();

        ClienteFisico cliente3 = new ClienteFisico();
        cliente3.consultarDados();

        ClienteFisico cliente4 = new ClienteFisico(2, "Nelson", "(11)91234-5678", "123.456.789-00");
        cliente4.consultarDados();
    }
}
