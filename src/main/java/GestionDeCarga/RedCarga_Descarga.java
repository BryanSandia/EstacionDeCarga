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

        VehiculoElectrico v1 = new VehiculoElectrico("Tesla", "Model S", 100.0, 50.0, 90);
        VehiculoElectrico v2 = new VehiculoElectrico("Nissan", "Leaf", 40.0, 30.0, 80);
        VehiculoElectrico v3 = new VehiculoElectrico("Chevrolet", "Bolt", 60.0, 20.0, 70);

        EstacionDeCarga estacion = new EstacionDeCarga();
        estacion.registrarVehiculo(v1);
        estacion.registrarVehiculo(v2);
        estacion.registrarVehiculo(v3);

        System.out.println("--- ESTADO ANTES DE LA CARGA MASIVA ---");
        v1.mostrarEstado();
        v2.mostrarEstado();
        v3.mostrarEstado();

        System.out.println("\n-|- Suministrando 15.0 kWh a todos los vehiculos en la estacion... -|-\n");
        estacion.suministrarEnergia();

        System.out.println("--- ESTADO DESPUES DE LA CARGA MASIVA ---");
        v1.mostrarEstado();
        v2.mostrarEstado();
        v3.mostrarEstado();
    }
}