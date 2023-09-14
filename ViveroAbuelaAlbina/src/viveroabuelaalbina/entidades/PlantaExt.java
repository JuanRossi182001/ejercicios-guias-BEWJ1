
package viveroabuelaalbina.entidades;


public class PlantaExt {
     private int plantaext_id;
    private String nombre;
    private String nombreC;
    private double precio;
    private String tamanio;
    private int cantidad;

    public PlantaExt() {
    }

    public PlantaExt(String nombre, String nombreC, double precio, String tamanio, int cantidad) {
        this.nombre = nombre;
        this.nombreC = nombreC;
        this.precio = precio;
        this.tamanio = tamanio;
        this.cantidad = cantidad;
    }

 

    

    

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
 
    public int getPlantaext_id() {
        return plantaext_id;
    }

    public void setPlantaext_id(int plantaext_id) {
        this.plantaext_id = plantaext_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
