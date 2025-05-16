package model;

import java.util.ArrayList;
import java.util.List;

import model.interacao.Comentario;
import model.interacao.Curtida;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private boolean isAdmin;
    private List<Denuncia> denuncias = new ArrayList<>();

    public Usuario(String nome, String email, String senha, String cpf, boolean isAdmin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.isAdmin = isAdmin;
    }

    // Métodos comuns para todos usuários
    public Denuncia cadastrarDenuncia(String titulo, String urlDasImagens, String descricao, String localizacao, Categoria categoria) {
        Denuncia denuncia = new Denuncia(titulo, urlDasImagens, descricao, localizacao, this, categoria);
        denuncias.add(denuncia);
        return denuncia;
    }

    public void curtirDenuncia(Denuncia denuncia) {
        denuncia.adicionarCurtida(new Curtida(this, denuncia));
    }

    public void comentarDenuncia(Denuncia denuncia, String texto) {
        denuncia.adicionarComentario(new Comentario(texto, this, denuncia));
    }

    // Métodos exclusivos para admin
    public Categoria cadastrarCategoria(String nome, String orgaoResponsavel) {
        if (!isAdmin) {
            System.out.println("Apenas administradores podem cadastrar categorias");
        } else{
            return new Categoria(nome, orgaoResponsavel);
        }
        return null;
    }

    public void atualizarStatusDenuncia(Denuncia denuncia, Denuncia.StatusDenuncia novoStatus) {
        if (!isAdmin) {
            System.out.println("Apenas administradores podem atualizar status");
        } else {
            denuncia.setStatus(novoStatus);
        }
    }


    // Getters
    public String getCpf() { return this.cpf; }
    public String getNome() { return this.nome; }
    public boolean isAdmin() { return this.isAdmin; }
    public List<Denuncia> getDenuncias() { return this.denuncias; }
}