package ExtraOrdenador;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Ordenador {

    //Atributos clases
    CPU procesator;
    Raton mouse;
    Teclado keyboard;
    Monitor screen;

    //Constructores
    public Ordenador() {
        procesator = new CPU();
        mouse = new Raton();
        keyboard = new Teclado();
        screen = new Monitor();
    }

    //Setters partes ordenador
    public void setCPU(int nucleos, int ram) {
        procesator.setNucleos(nucleos);
        procesator.setRAM(ram);
    }

    public void setRaton(boolean inalambrico, String modelo) {
        mouse.setInalambrico(inalambrico);
        mouse.setModelo(modelo);
    }

    public void setKeyboard(int numTeclas) {
        keyboard.setTeclas(numTeclas);
    }

    public void setScreen(String marca, float pulgadas) {
        screen.setMarca(marca);
        screen.setPulgadas(pulgadas);
    }

    //Visualizacion de los atributos de las clases
    public void visualizarAtributos() {
        JOptionPane.showMessageDialog(null, " Numero de nucleos : " + procesator.getNucleos() + "\n Numero de ram : "
                + procesator.getRAM() + "\n Raton Inalambrico : " + mouse.getInalambrico()
                + "\n Modelo de Raton : " + mouse.getModelo()
                + "\n Numero de teclas : " + keyboard.getTeclas() + "\n Marca de la pantalla "
                + ": " + screen.getMarca() + "\n Pulgadas de la pantalla : " + screen.getPulgadas());
    }
}


//    Calculo del precio
//    public double calcularPrecio() {
//        double precio = procesator.getRAM() * 5 + keyboard.getTeclas() * 0,7 + screen.getPulgadas() * 12;
//        if (mouse.getInalambrico() == true) {
//            return Math.round(precio * 1, 5);
//        }
//        else
//        return Math.round (precio);
//    }
//}
