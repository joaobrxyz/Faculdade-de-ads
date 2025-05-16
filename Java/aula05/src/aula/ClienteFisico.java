package aula;

import javax.swing.*;

public class ClienteFisico extends Clientes {
    public String cpf;

    public ClienteFisico() {
        super();
        this.setCpf("");
    }

    public ClienteFisico(int id, String nome, String telefone, String cpf) {
        super(id, nome, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void consultarDados() {
        String dados = "Dados do cliente \n";
        dados += "Id. Cliente: " + this.getIdCliente() + "\n";
        dados += "Nome: " + this.getNome() + "\n";
        dados += "Telefone: " + this.getTelefone() + "\n";
        dados += "Cpf: " + this.getCpf() + "\n";
        JOptionPane.showMessageDialog(null, dados);
    }
}
