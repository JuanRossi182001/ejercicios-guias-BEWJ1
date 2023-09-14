
package viveroabuelaalbina.entidades;


public class PlantaInt {
    private int plantaint_id;
    private String nombre;
    private String nombreC;
    private int precio;
    private String altura;
    
    
    public PlantaInt() {
    }

    public PlantaInt(int plantaint_id, String nombre, String nombreC, int precio, String altura) {
        this.plantaint_id = plantaint_id;
        this.nombre = nombre;
        this.nombreC = nombreC;
        this.precio = precio;
        this.altura = altura;
    }

  

    public int getPlantaint_id() {
        return plantaint_id;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void setPlantaint_id(int plantaint_id) {
        this.plantaint_id = plantaint_id;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
