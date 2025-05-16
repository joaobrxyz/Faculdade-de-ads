package model;

import model.interacao.Comentario;
import model.interacao.Curtida;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Denuncia {
    private String protocolo;
    private String titulo;
    private String descricao;
    private String urlDasImagens;
    private String localizacao;
    private Date dataAbertura;
    private StatusDenuncia status;
    private Usuario autor;
    private Categoria categoria;
    private List<Curtida> curtidas = new ArrayList<>();
    private List<Comentario> comentarios = new ArrayList<>();

    public Denuncia(String titulo, String urlDasImagens, String descricao, String localizacao, Usuario autor, Categoria categoria) {
        this.titulo = titulo;
        this.urlDasImagens = urlDasImagens;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.autor = autor;
        this.categoria = categoria;
        this.dataAbertura = new Date();
        this.status = StatusDenuncia.ABERTA;
    }

    public void adicionarCurtida(Curtida curtida) {
        curtidas.add(curtida);
    }
    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }
    public void setStatus(StatusDenuncia status) {
        this.status = status;
    }
    public enum StatusDenuncia {
        ABERTA,
        RESOLVIDA
    }

    // Getters
    public String getProtocolo() { return this.protocolo; }
    public String getTitulo() { return this.titulo; }
    public String getUrlDasImagens() { return this.urlDasImagens; }
    public StatusDenuncia getStatus() { return this.status; }
    public Usuario getAutor() { return this.autor; }
    public List<Curtida> getCurtidas() { return this.curtidas; }
    public List<Comentario> getComentarios() { return this.comentarios; }
}