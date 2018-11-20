package ExtraOrdenador;

/**
 *
 * @author clamascabaleiro
 */
public class Monitor {

    private String marca;
    private float pulgadas;

    public Monitor() {
    }

    public Monitor(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String visualizar() {
        return "Características monitor\nMarca: " + marca + "\nPulgadas: " + pulgadas + "\n";
    }
}
