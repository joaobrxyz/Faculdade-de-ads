package model.interacao;

import model.Denuncia;
import model.Usuario;
import java.util.Date;

public class Comentario {
    private String id;
    private String texto;
    private Usuario autor;
    private Denuncia denuncia;
    private Date data;

    public Comentario(String texto, Usuario autor, Denuncia denuncia) {
        this.texto = texto;
        this.autor = autor;
        this.denuncia = denuncia;
        this.data = new Date();
    }

    // Getters
    public String getTexto() { return texto; }
    public Usuario getAutor() { return autor; }
    public Date getData() { return data; }
}