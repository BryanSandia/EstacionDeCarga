/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package GestionDeCarga;

/**
 *
 * @author Bryan Tacuri
 */
public class RedCarga_Descarga {

    public static void main(String[] args) {

        vehiculo v1 = new vehiculo();
        v1.setMarca("Tesla");
        v1.setModelo("Model S");
        Bateria b1 = new Bateria();
        b1.setCapacidadActual(50);
        b1.setEstadoSalud(90);
        v1.setBateria(b1);

        //vehiculo 2
        vehiculo v2 = new vehiculo();
        v2.setMarca("Nissan");
        v2.setModelo("Leaf");
        Bateria b2 = new Bateria();
        b2.setCapacidadActual(30);
        b2.setEstadoSalud(80);
        v2.setBateria(b2);

        //vehiculo 3
        vehiculo v3 = new vehiculo();
        v3.setMarca("Chevrolet");
        v3.setModelo("Bolt");
        Bateria b3 = new Bateria();
        b3.setCapacidadActual(20);
        b3.setEstadoSalud(70);
        v3.setBateria(b3);

        EstacionDeCarga estacion = new EstacionDeCarga();
        estacion.registrarVehiculo(v1);
        estacion.suministrarEnergia(v1); // Cargar el vehículo v1 con 40 kWh
        estacion.registrarVehiculo(v2);
        estacion.suministrarEnergia(v2); // Cargar el vehículo v2 con 40 kWh
        estacion.registrarVehiculo(v3);
        estacion.suministrarEnergia(v3); // Cargar el vehículo v3 con 40 kWh


    System.out.println("Estado del vehiculo 1:");
    v1.mostrarEstado();
    System.out.println("\nEstado del vehiculo 2:");
    v2.mostrarEstado();
    System.out.println("\nEstado del vehiculo 3:");
    v3.mostrarEstado();
    }
}
