package ExtraOrdenador;

/**
 *
 * @author clamascabaleiro
 */
public class Raton {

    private boolean inalambrico;
    private String modelo;

    public Raton() {
    }

    public Raton(boolean inalambrico, String modelo) {
        this.inalambrico = inalambrico;
        this.modelo = modelo;
    }

    public boolean getInalambrico() {
        return inalambrico;
    }

    public String getModelo() {
        return modelo;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String visualizar() {
        if (inalambrico = true) {
            return "Características ratón\nInalámbrico: Sí\nModelo: " + modelo + "\n";
        } else {
            return "Características ratón\nInalámbrico: No\nModelo: " + modelo + "\n";
        }
    }
}
