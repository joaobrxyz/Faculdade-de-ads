package grafico_manha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Desafio extends Janela implements ActionListener {
    JButton btSomar, btSubtrair;
    JLabel lblN1, lblN2, lblRes;
    JTextField txtN1, txtN2, txtRes;

    public Desafio() {
        super("Desafio", 500, 300);

        lblN1 = new JLabel("Digite um Número");
        lblN1.setSize(150, 30);
        lblN1.setLocation(10, 10);
        getContentPane().add(lblN1);

        txtN1 = new JTextField();
        txtN1.setSize(150, 30);
        txtN1.setLocation(10, 40);
        getContentPane().add(txtN1);

        lblN2 = new JLabel("Digite outro Número");
        lblN2.setSize(150, 30);
        lblN2.setLocation(10, 70);
        getContentPane().add(lblN2);

        txtN2 = new JTextField();
        txtN2.setSize(150, 30);
        txtN2.setLocation(10, 100);
        getContentPane().add(txtN2);

        lblRes = new JLabel("Resultado");
        lblRes.setSize(150, 30);
        lblRes.setLocation(10, 130);
        getContentPane().add(lblRes);

        txtRes = new JTextField();
        txtRes.setSize(150, 30);
        txtRes.setLocation(10, 160);
        getContentPane().add(txtRes);

        btSomar = new JButton("Somar");
        btSomar.setSize(100, 30);
        btSomar.setLocation(200, 20);
        getContentPane().add(btSomar);

        btSubtrair = new JButton("Subtrair");
        btSubtrair.setSize(100, 30);
        btSubtrair.setLocation(200, 70);
        getContentPane().add(btSubtrair);

        btSomar.addActionListener(this);
        btSubtrair.addActionListener(this);
    }

    public static void main(String[] args) {
        Desafio tela = new Desafio();
        tela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btSomar) {
            int n1 = txtN1.getText().toString();
        }
    }
}
