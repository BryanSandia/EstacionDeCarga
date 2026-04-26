/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeCarga;

/**
 *
 * @author ASUS
 */
public class VehiculoElectrico {
    private String marca;
    private String modelo;
    private Bateria bateria; // Composición

    public VehiculoElectrico(String marca, String modelo, double capMaxBat, double capActualBat, int estadoSaludBat) {
        this.marca = marca;
        this.modelo = modelo;
        // La batería se crea DENTRO del vehículo (Composición)
        this.bateria = new Bateria(capMaxBat, capActualBat, estadoSaludBat); 
    }

    public String getMarca() { 
        return marca; 
    }
    public String getModelo() { 
        return modelo; 
    }
    public Bateria getBateria() { 
        return bateria; 
    }

    public void mostrarEstado() {
        System.out.println("Vehículo: " + marca + " " + modelo);
        System.out.println(" -> Carga actual: " + bateria.getCapacidadActual() + " / " + bateria.getCapacidadMaxima() + " kWh");
        System.out.println(" -> Salud batería: " + bateria.getEstadoSalud() + "%");
    }

   
    public void cargar(double kwh) {
        double nuevaCarga = bateria.getCapacidadActual() + kwh;
        if (nuevaCarga > bateria.getCapacidadMaxima()) {
            bateria.setCapacidadActual(bateria.getCapacidadMaxima());
        } else {
            bateria.setCapacidadActual(nuevaCarga);
        }
    }
}
    

