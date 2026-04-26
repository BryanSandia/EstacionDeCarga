
package GestionDeCarga;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryan Tacuri
 */
public class EstacionDeCarga {
   // Agregación: La estación maneja una lista de vehículos
    private List<VehiculoElectrico> vehiculosRegistrados;

    public EstacionDeCarga() {
        this.vehiculosRegistrados = new ArrayList<>();
    }

    public void registrarVehiculo(VehiculoElectrico v) {
        vehiculosRegistrados.add(v);
    }

    public void suministrarEnergia() {
        double kwhFijos = 15.0;
        for (VehiculoElectrico v : vehiculosRegistrados) {
            v.cargar(kwhFijos);
        }
    }


}

