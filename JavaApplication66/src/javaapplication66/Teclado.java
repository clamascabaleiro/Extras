package javaapplication66;

/**
 *
 * @author clamascabaleiro
 */
public class Teclado {

    private int numTeclas;

    public Teclado() {
    }

    public Teclado(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    public int getTeclas() {
        return numTeclas;
    }

    public void setTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    public String visualizar() {
        return "Características teclado\nTeclas: " + numTeclas + "\n";
    }
}
