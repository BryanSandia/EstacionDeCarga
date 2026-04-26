package GestionDeCarga;

/**
 *
 * @author Bryan Tacuri
 */
public class Bateria {
    private double capacidadActual;
    // de 0 a 100
    private int estadoSalud;


    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void setEstadoSalud(int estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public int getEstadoSalud() {
        return estadoSalud;
    }

    public void usar(double cantidad){
        // lógica para usar la batería
        this.capacidadActual -= cantidad;
    }


}
