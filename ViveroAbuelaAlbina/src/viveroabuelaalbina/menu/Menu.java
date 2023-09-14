/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viveroabuelaalbina.menu;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import viveroabuelaalbina.entidades.Cliente;
import viveroabuelaalbina.persistencia.AdminDAO;
import viveroabuelaalbina.persistencia.ClienteDAO;

/**
 *
 * @author mtbst
 */
public class Menu {
    AdminDAO ad = new AdminDAO();
    public void menuCliente(Cliente cliente){
        Scanner read = new Scanner(System.in);
        ClienteDAO c = new ClienteDAO();
        int eleccion;
        Boolean superFlag=true;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("");
         System.out.println("----------Que Desea Hacer?----------");
        System.out.println("Opcion 1: Ver Stock De Plantas De Interior");
        System.out.println("------------------------------------------");
        System.out.println("Opcion 2: Ver Stock De Plantas De Exterior");
        System.out.println("------------------------------------------");
        System.out.println("Opcion 3: Ver Todo El Stock");
        System.out.println("------------------------------------------");
        System.out.println("Opcion 4: Agendar Una Cita En El Vivero");
        System.out.println("------------------------------------------");
        System.out.println("Opcion 5: Salir");
        eleccion=read.nextInt();
        switch (eleccion) {
            case 1:
                try {
                    c.consultarStockInt();
                } catch (Exception ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("ERROR, ALGO SALIO MAL :p");
                }

                break;
            case 2:
                try {
                    c.consultarStockExt();
                } catch (Exception ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("ERROR, ALGO SALIO MAL :p");
                }

                break;
            case 3:
        {
            try {
                c.consultarTodo();
            } catch (Exception ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("ERROR, ALGO SALIO MAL :p");
            }
        }
                break;
            case 4:
                
                 c.mostrarCitas();
                 c.agendarCita(c.seleccionCita(),cliente.getUser());
  
                break;
                
            case 5:
                superFlag=false;
                break;
            default:
                System.out.println("Opcion no valida");
        }

        } while (superFlag==true);
        
      
    }
    
    
    public void menuAdmin() throws Exception{
        AdminDAO ad=new AdminDAO();
        Scanner read = new Scanner(System.in);
         int eleccion;
         Boolean superFlag=true;
         
         
         do {
         System.out.println("");
         System.out.println("");
         System.out.println("");
         
        System.out.println("----------Bienvenido Admin----------");
        System.out.println("----------Que Desea Hacer?----------");
        System.out.println("Opcion 1: Modificar Stock De Plantas De Exterior"); //READY
        System.out.println("------------------------------------------");
        System.out.println("Opcion 2: Modificar Stock De Plantas De Interior"); //READY
        System.out.println("------------------------------------------");
        System.out.println("Opcion 3: Ver Todo El Stock");  //READY
        System.out.println("------------------------------------------"); 
        System.out.println("Opcion 4: Ver Stock De Plantas De Exterior"); //READY
        System.out.println("------------------------------------------");
        System.out.println("Opcion 5: Ver Stock De Plantas De Interior"); //READY
        System.out.println("------------------------------------------");
        System.out.println("Opcion 6: Ver citas Pendientes");             //READY
        System.out.println("------------------------------------------");
        System.out.println("Opcion 7: Modificar citas");
        System.out.println("------------------------------------------");
        System.out.println("Opcion 8 Salir");
        eleccion=read.nextInt();
        switch(eleccion){
            case 1:
                int eleccion1;
                System.out.println("Opcion 1: elimiar Un Registro");
                System.out.println("-------------------------------------");
                System.out.println("Opcion 2:Agregar Un Registro");
                System.out.println("-------------------------------------");
                System.out.println("Opcion 3: modificar un resgitro");
                eleccion1=read.nextInt();
                switch(eleccion1){
                    case 1:
                        ad.consultarStockExt();
                        ad.eliminarRegistroExt(ad.seleccionRegistroEliminar());
                        break;
                    case 2:
                        ad.agregarRegsitroExt();
                        break;
                    case 3:
                        boolean flag=true;
                        do {
                         System.out.println("Seleccione que desea modificar");
                        System.out.println("Opcion 1: Modificar precio");             //TODO EL CASE 1 (MODIFICAR EXT) READY
                        System.out.println("Opcion 2: Modificar tamanio");
                        System.out.println("Opcion 3: Modificar cantidad");
                        int choice=read.nextInt();
                        if (choice==1) {
                            ad.consultarStockExt();
                            ad.cambiarPrecioExt(ad.seleccionRegistroCambiar());
                            flag=false;
                        }else if(choice==2){
                            ad.consultarStockExt();
                            ad.cambiarTamanioExt(ad.seleccionRegistroCambiar());
                            flag=false;
                        }else if(choice==3){
                            ad.consultarStockExt();
                            ad.cambiarCantidadExt(ad.seleccionRegistroCambiar());
                            flag=false;
                        }else{
                            System.out.println("Ingrese Una Opcion Valida");
                        }
                        } while (flag==true);
                        
                        
                        break;
            }
               break;
            case 2:
                  int eleccion2;
                System.out.println("Opcion 1: elimiar Un Registro");
                System.out.println("-------------------------------------");
                System.out.println("Opcion 2:Agregar Un Registro");
                System.out.println("-------------------------------------");
                System.out.println("Opcion 3: modificar un resgitro");
                eleccion2=read.nextInt();
                switch(eleccion2){
                    case 1:
                        ad.consultarStockInt();
                         ad.eliminarRegistroInt(ad.seleccionRegistroEliminar());
                        break;
                    case 2:
                        ad.agregarRegsitroInt();
                        break;
                    case 3:
                          boolean flag=true;
                        do {
                         System.out.println("Seleccione que desea modificar");
                        System.out.println("Opcion 1: Modificar precio");             //TODO EL CASE 2 (MODIFICAR INT) READY
                        System.out.println("Opcion 2: Modificar altura");
                        System.out.println("Opcion 3: Modificar Cantidad");
                        int choice=read.nextInt();
                        if (choice==1) {
                              ad.consultarStockInt();
                            ad.cambiarPrecioInt(ad.seleccionRegistroCambiar());
                            flag=false;
                        }else if(choice==2){
                              ad.consultarStockInt();
                            ad.cambiarAlturaInt(ad.seleccionRegistroCambiar());
                            flag=false;
                          }else if(choice==3){
                            ad.consultarStockInt();
                            ad.cambiarCantidadInt(ad.seleccionRegistroCambiar());
                            flag=false;
                        }else{
                            System.out.println("Ingrese Una Opcion Valida");
                        }
                        } while (flag==true);
                        break;
            }
                break;
            case 3:
                ad.consultarTodo();
                
                break;
            case 4:
                ad.consultarStockExt();
                break;
            case 5:
                ad.consultarStockInt();
                break;
            case 6:
                ad.verCitasPendientes();
                break;
            case 7:
                boolean flag=true;
                do {
                     System.out.println("-------Modificar Citas--------");
                System.out.println("Seleccione Que Desea Modificar");
                System.out.println("Opcion 1: Modificar Horario De Una Cita");
                System.out.println("Opcion 2: Modificar Fecha De Una Cita");
                System.out.println("Opcion 3: Eliminar citas");
                 System.out.println("Opcion 4: Agregar Citas");
                int choice1=read.nextInt();
                if (choice1==1) {
                    ad.mostrarCitasDisponbles();
                    ad.cambiarHorarioCita(ad.seleccionRegistroCambiar());
                    flag=false;
                }else if(choice1==2){
                    ad.mostrarCitasDisponbles();
                    ad.cambiarFechaCita(ad.seleccionRegistroCambiar());
                    flag=false;
                }else if(choice1==3){
                    ad.mostrarTodasLasCitas();
                    ad.eliminarCitas(ad.seleccionRegistroEliminar());
                    flag=false;
                }else if (choice1==4){
                    ad.agregarCita();
                }
                    
                } while (flag==true);
                
                break;
                
            case 8:
                superFlag=false;
                break;
            default:
                System.out.println("Opcion no valida");
        }
        
        } while (superFlag==true);
       
    }
    
    
    
    
    
    
    
}
