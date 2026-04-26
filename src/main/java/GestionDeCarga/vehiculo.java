
package GestionDeCarga;

/**
 *
 * @author Bryan Tacuri
 */
public class vehiculo {
    private String marca;
    private String modelo;
    private Bateria bateria;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
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

    public void mostrarEstado(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad Actual: " + bateria.getCapacidadActual());
    }

    public void carga(double kwh){
        //logica de carga
        while (bateria.getCapacidadActual() < 100) {
            double carga = kwh * 0.9; // suponiendo una eficiencia del 90%
            bateria.setCapacidadActual(bateria.getCapacidadActual() + carga);           
        }
        
    }
}
