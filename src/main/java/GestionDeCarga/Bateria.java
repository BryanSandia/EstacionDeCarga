package GestionDeCarga;

/**
 *
 * @author Bryan Tacuri
 */
public class Bateria {
    private double capacidadMaxima;
    private double capacidadActual;
    private int estadoSalud; // de 0 a 100

    public Bateria(double capacidadMaxima, double capacidadActual, int estadoSalud) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        this.estadoSalud = estadoSalud;
    }

    public double getCapacidadActual() { 
        return capacidadActual; }
    public void setCapacidadActual(double capacidadActual) { 
        this.capacidadActual = capacidadActual; 
    }
    
    public double getCapacidadMaxima() { 
        return capacidadMaxima; 
    }
    
    public int getEstadoSalud() { 
        return estadoSalud; 
    }
    public void setEstadoSalud(int estadoSalud) { 
        this.estadoSalud = estadoSalud; 
    }

    public void usar(double cantidad) {
        if (this.capacidadActual >= cantidad) {
            this.capacidadActual -= cantidad;
        } else {
            this.capacidadActual = 0;
        }
    }
}