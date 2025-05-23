package aula;

import javax.swing.*;

public class Piloto implements Contrato {
    @Override
    public void regra01() {
        JOptionPane.showMessageDialog(null, "regra01 da classe Piloto");
    }

    @Override
    public void regra02() {
        JOptionPane.showMessageDialog(null, "regra02 da classe Piloto");
    }
}
