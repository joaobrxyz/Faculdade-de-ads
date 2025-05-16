package model.interacao;

import model.Denuncia;
import model.Usuario;
import java.util.Date;

public class Curtida {
    private String id;
    private Usuario usuario;
    private Denuncia denuncia;
    private Date data;

    public Curtida(Usuario usuario, Denuncia denuncia) {
        this.usuario = usuario;
        this.denuncia = denuncia;
        this.data = new Date();
    }

    // Getters
    public Usuario getUsuario() { return usuario; }
    public Date getData() { return data; }
}