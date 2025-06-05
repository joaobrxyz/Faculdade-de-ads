package grafico_manha;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    public Janela() {
        setTitle("Exemplo");
        setSize(300, 250);
        setLocation(100, 100);
    }
    public Janela(String titulo, int tamanhoX, int tamanhoY) {
        setTitle(titulo);
        setSize(tamanhoX, tamanhoY);
        setLocation(250, 50);
        setLayout(null);
    }
    public static void main(String[] args) {
        Janela tela = new Janela();
        tela.setVisible(true);

        Janela tela2 = new Janela("Título da janela", 500, 300);
        tela2.setVisible(true);
    }
}
