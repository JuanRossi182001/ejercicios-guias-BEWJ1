
package viveroabuelaalbina.entidades;

import java.util.Scanner;



public class Cliente extends Persona {
    private int cliente_id;
    private String user;
    private String password;

    public Cliente() {
    }

    public Cliente( String user, String password) {
        this.user = user;
        this.password = password;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    Scanner read = new Scanner(System.in);
    
    
    public Cliente crearCliente(){
        boolean flag=true;
        Cliente p = new Cliente();
        System.out.println("Bienvenido, ingrese su nombre de usuario");
        setUser(read.next());
        do {
             System.out.println("Ingrese una contrasenia(debe tener al menos 5 caracteres)");
            p.setPassword(read.next());
            if (p.getPassword().length()>5) {
                flag=false;
            }else{
                System.out.println("debe ingresar una clave mas larga");
            }
        } while (flag);
        
        
        return p;
    }
    

    
}
