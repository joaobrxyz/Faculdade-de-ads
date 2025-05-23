package aula;

import javax.swing.*;

public class Jogador implements Contrato, Contrato2 {

    @Override
    public void regra01() {
        JOptionPane.showMessageDialog(null, "Programação da regra01");
    }

    @Override
    public void regra02() {
        JOptionPane.showMessageDialog(null, "Programação da regra02");
    }

    @Override
    public void regra03() {
        JOptionPane.showMessageDialog(null, "Programação da regra03");
    }
}