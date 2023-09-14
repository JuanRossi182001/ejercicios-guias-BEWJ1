
package viveroabuelaalbina;


import java.util.Scanner;
import viveroabuelaalbina.entidades.Cliente;
import viveroabuelaalbina.menu.Menu;
import viveroabuelaalbina.persistencia.AdminDAO;
import viveroabuelaalbina.persistencia.ClienteDAO;


public class ViveroAbuelaAlbina {
    
    public static void main(String[] args) throws Exception {
       
        Scanner read = new Scanner(System.in);
        boolean flag=true;
        boolean flag1=true;
        boolean flag3;
         String password;
        ClienteDAO c = new ClienteDAO();
        Menu m = new Menu();
        AdminDAO ad = new AdminDAO();
        
  
                 
        System.out.println("--------Bienvenido Al Sistema De Vivero Abuela Albina--------");
        System.out.println("------------------------------------------------------------------------");
        do {
            System.out.println("Ingrese 1 si usted es un nuevo usuario, si ya tiene un usuario presione 2");
            int choice = read.nextInt();
          switch(choice){
              case 1:
                  System.out.println("Bienvenido, ingrese su nombre de usuario");
                  String user = read.next();
                  do {
                      System.out.println("Ingrese una contrasenia(debe tener al menos 5 caracteres)");
                      password = read.next();
                      if (password.length() > 5) {
                          flag1 = false;
                      } else {
                          System.out.println("debe ingresar una clave mas larga");
                      }
                  } while (flag1);
                  Cliente p = new Cliente(user, password);
                  c.guardarCliente(p);
                  c.ingresoSistemaUsuarioNuevo(p);
                  flag=false;
                  break;
              case 2:
                  m.menuCliente(c.ingresoSistema());
                  flag=false;
                  break;
                  
              case 2657:
                  m.menuAdmin();
                  flag=false;
              default:
                  System.out.println("opcion no valida");
          }
        } while (flag);
        
     
        
    } //Main End2
    
    
  
} //Class End
