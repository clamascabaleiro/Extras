package ExtraOrdenador;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class ExtraOrdenador {

    public static void main(String[] args) {

        Ordenador pepino = new Ordenador();
        pepino.setCPU(6, 12);
        pepino.setRaton(true, "Corsair");
        pepino.setKeyboard(62);
        pepino.setScreen("BenQ", 18.5f);
        pepino.visualizarAtributos();
        JOptionPane.showMessageDialog(null, pepino.calcularPrecio() + "€");
    }

}
