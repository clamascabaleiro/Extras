package javaapplication66;

/**
 *
 * @author clamascabaleiro
 */
public class CPU {

    private int nucleos;
    private int ram;

    public CPU() {
    }

    ;
    public CPU(int nucleos, int ram) {
        this.nucleos = nucleos;
        this.ram = ram;
    }

    public int getNucleos() {
        return nucleos;
    }

    public int getRAM() {
        return ram;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public void setRAM(int ram) {
        this.ram = ram;
    }

    public String visualizar() {
        return "Características CPU\nNúcleos: " + nucleos + "\nMemoria RAM: " + ram + "GB\n";
    }
}
