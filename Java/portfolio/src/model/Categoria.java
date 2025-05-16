package model;

public class Categoria {
    private String id;
    private String nome;
    private String setorResponsavel;

    public Categoria(String nome, String setorResponsavel) {
        this.nome = nome;
        this.setorResponsavel = setorResponsavel;
    }

    // Getters
    public String getNome() { return nome; }
    public String getSetorResponsavel() { return setorResponsavel; }
}