package aula;

public class Cao {
    float altura, peso;
    static String comida;

    public void correr() {
        System.out.println("O cachorro está correndo...");
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Comida: " + this.getComida());
    }
    public void latir() {
        System.out.println("O cão está latindo...");
    }
    public static void morder() {
        System.out.println("O cão está mordendo...");
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
}
