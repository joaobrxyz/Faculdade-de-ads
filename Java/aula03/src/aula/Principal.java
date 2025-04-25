package aula;

public class Principal {
    public static void main(String[] args) {
        Cao ruby = new Cao();
        ruby.setAltura(20);
        ruby.setPeso(5);
        ruby.setComida("Ração + Petiscos");
        ruby.correr();
        ruby.latir();

        Cao lulu = new Cao();
        lulu.setAltura(25);
        lulu.setPeso(10);
        lulu.correr();
        lulu.latir();

        Cao.morder();
    }
}
