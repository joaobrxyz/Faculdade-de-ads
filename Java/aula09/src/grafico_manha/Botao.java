package grafico_manha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Botao extends Janela implements ActionListener {
    JButton bt1, bt2, btSair;
    JLabel lblMsg1;
    JTextField txtTexto;

    public Botao() {
        super("Exemplo de Botões", 350, 350);

        lblMsg1 = new JLabel("Selecione um botão");
        lblMsg1.setSize(150, 30);
        lblMsg1.setLocation(50, 10);
        getContentPane().add(lblMsg1);

        bt1 = new JButton("Botão 1");
        bt1.setSize(220, 50);
        bt1.setLocation(50, 50);
        getContentPane().add(bt1);

        bt2 = new JButton("Botão 2");
        bt2.setSize(220, 50);
        bt2.setLocation(50, 120);
        getContentPane().add(bt2);

        btSair = new JButton("Sair");
        btSair.setSize(220, 50);
        btSair.setLocation(50, 190);
        getContentPane().add(btSair);

        txtTexto = new JTextField();
        txtTexto.setSize(220, 50);
        txtTexto.setLocation(50, 260);
        getContentPane().add(txtTexto);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        btSair.addActionListener(this);
    }

    public static void main(String[] args) {
        Botao tela = new Botao();
        tela.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            JOptionPane.showMessageDialog(null, "Você clicou no botão 1");
        }
        if (e.getSource() == bt2) {
            JOptionPane.showMessageDialog(null, "Você clicou no botão 2");
        }
        if (e.getSource() == btSair) {
            System.exit(0);
        }
    }
}
