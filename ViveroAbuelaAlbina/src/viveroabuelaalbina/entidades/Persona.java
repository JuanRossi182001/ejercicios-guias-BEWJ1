
package viveroabuelaalbina.entidades;


public abstract class Persona {
    private int persona_id;
    private String nombre;
    private String apellido;
    private int dni;

    public int getPersona_id() {
        return persona_id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setPersona_id(int Persona_id) {
        this.persona_id = persona_id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
}
