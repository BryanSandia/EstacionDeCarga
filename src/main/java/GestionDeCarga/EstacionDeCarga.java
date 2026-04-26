
package GestionDeCarga;

/**
 *
 * @author Bryan Tacuri
 */
public class EstacionDeCarga {
    private vehiculo v;

    public vehiculo getV() {
        return v;
    }

    public void setV(vehiculo v) {
        this.v = v;
    }

    //metodos
    public void registrarVehiculo(vehiculo v){
        // lógica para registrar un vehículo en la estación de carga
        this.v = v;
    }


    public void suministrarEnergia(vehiculo v){
        // lógica para suministrar energía a un vehículo
        double kwh =15; //kwh fijos a entregar
        v.carga(kwh);
    }


}

