package aula;

import javax.swing.*;

public class Clientes {
    public int idCliente;
    public String nome, telefone;

    public Clientes() {
        this.setIdCliente(0);
        this.setNome("");
        this.setTelefone("");
    }

    public Clientes(int id, String nome, String telefone) {
        this.setIdCliente(id);
        this.setNome(nome);
        this.setTelefone(telefone);
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void consultarDados() {
        String dados = "Dados do cliente \n";
        dados += "Id. Cliente: " + this.getIdCliente() + "\n";
        dados += "Nome: " + this.getNome() + "\n";
        dados += "Telefone: " + this.getTelefone() + "\n";
        JOptionPane.showMessageDialog(null, dados);
    }
}