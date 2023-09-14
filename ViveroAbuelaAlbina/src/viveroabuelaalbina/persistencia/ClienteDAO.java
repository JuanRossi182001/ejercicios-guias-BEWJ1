
package viveroabuelaalbina.persistencia;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import viveroabuelaalbina.entidades.Cliente;


public final class ClienteDAO extends DAO {

    public ClienteDAO() {
    }
    
    public void guardarCliente(Cliente cliente) throws Exception {

        try {
            if (cliente == null) {
                throw new Exception("Debe ingresar un cliente");
            }
            String sql = "INSERT INTO Cliente (user,password)"
                    + "VALUES ( '" + cliente.getUser() + "' , '" + cliente.getPassword() + "');";
            insertarModificarEliminar(sql); // aca uso el metodo creado en el DAO para modificar algo en la database
        } catch (Exception ex) {
            throw ex;
        } finally {
            desconectarBase();
        }
    } // recibe un objeto de tipo cliente y lo guarda en la tabla cliente en la base de datos

    public void modificarCliente() throws Exception {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Ingrese su nombre de usuario");
            String user=read.next();
            System.out.println("Ingrese su nueva contrasenia");
            String passwordNew=read.next();
            

            String sql = "UPDATE Cliente SET "
                    + "password = '" + passwordNew + "' WHERE user = '" + user + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarCliente() throws Exception {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Ingrese su nombre de usuario para ser eliminado");
            System.out.println("Recuerde que esta accion NO PUEDE revertirse");
            String user=read.next();

            String sql = "DELETE FROM Cliente WHERE user = '" + user + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Cliente> listarClientes() throws Exception {
        try {
            String sql = "SELECT user,password FROM Cliente ";

            consultarBase(sql);

            Cliente cliente = null;
            Collection<Cliente> clientes = new ArrayList();
            while (resultado.next()) {     // resultado es la variable de tipo resultSet creada en la clase padre DAO
                Cliente s = new Cliente();
                s.setUser(resultado.getString("user"));
                s.setPassword(resultado.getString("password"));
                clientes.add(s);
            }
            desconectarBase();
            return clientes;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public void consultarStockInt() throws SQLException, Exception {

        try {
            String sql = "SELECT * FROM PlantasInt;";
            // ejecuto la consulta y obtengo los resultados
            consultarBase(sql);
            //Obtengo los metadatos de la tabla
            ResultSetMetaData metaData = resultado.getMetaData();
            int columnCount = metaData.getColumnCount();

             // Definir el ancho fijo para cada columna
            int[] anchosColumnas = {10, 20, 20,10,10,10};
             System.out.println("------------Plantas de Interior--------------");
            
           for (int i = 1; i <= columnCount; i++) {
                String nombreColumna = metaData.getColumnName(i);
                System.out.printf("%-" + anchosColumnas[i - 1] + "s\t", nombreColumna);
            }
            System.out.println();
            
            // Imprimir los datos de la tabla
            while (resultado.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    String valorCelda = resultado.getString(i);
                    System.out.printf("%-" + anchosColumnas[i - 1] + "s\t", valorCelda);
                }
                System.out.println();
            }
            
            
            
          /*        
            // Imprimir los nombres de las columnas
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();

            // Imprimir los datos de la tabla
            while (resultado.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultado.getString(i) + "\t");
                }
                System.out.println();
            }
*/
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    public void consultarStockExt() throws SQLException, Exception {
        
        try {
            String sql = "SELECT * FROM PlantasExt;";
            // ejecuto la consulta y obtengo los resultados
            consultarBase(sql);
            //Obtengo los metadatos de la tabla
            ResultSetMetaData metaData = resultado.getMetaData();
            int columnCount = metaData.getColumnCount();

             // Definir el ancho fijo para cada columna
            int[] anchosColumnas = {10, 20, 20,10,10,10};
             System.out.println("------------Plantas de Exterior--------------");
            
           for (int i = 1; i <= columnCount; i++) {
                String nombreColumna = metaData.getColumnName(i);
                System.out.printf("%-" + anchosColumnas[i - 1] + "s\t", nombreColumna);
            }
            System.out.println();
            
            // Imprimir los datos de la tabla
            while (resultado.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    String valorCelda = resultado.getString(i);
                    System.out.printf("%-" + anchosColumnas[i - 1] + "s\t", valorCelda);
                }
                System.out.println();
            }
            
            
            
          /*        
            // Imprimir los nombres de las columnas
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();

            // Imprimir los datos de la tabla
            while (resultado.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultado.getString(i) + "\t");
                }
                System.out.println();
            }
*/
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    public void consultarTodo() throws Exception{
        try{
       
        System.out.println("");
        consultarStockInt();
        System.out.println("");
        System.out.println("");
        consultarStockExt();
        }catch(Exception e){
            e.printStackTrace();
        }
       
    }
   
   public void ingresoSistemaUsuarioNuevo(Cliente cliente){
       try{
           String sql="SELECT * FROM cliente WHERE user='" + cliente.getUser() + "' AND password='" + cliente.getPassword() + "';";
           consultarBase(sql);
           
           if(resultado.next()){
               System.out.println("Bienvenido Usuario " + cliente.getUser());                            //esto no esta funcionando nose porque, creo que el query esta mal
           }else{
               System.out.println("La contrania o usuario ingresados son incorrectos, intente nuevamente");
           }
       }catch(Exception e){
           System.out.println("ESTO SALIO MAL");
       }
   }
   
    public Cliente ingresoSistema(){
    Scanner read = new Scanner(System.in);
  Cliente cliente = new Cliente();
  boolean flag=true;
  int i =0;
    System.out.println("Bienvenido, Ingrese Su Usuario Y contrasenia");
    do {
        System.out.println("USUARIO:");
        cliente.setUser(read.next());
        System.out.println("CONTRASENIA:");
        cliente.setPassword(read.next());
        try{
           String sql="SELECT * FROM cliente WHERE user='" + cliente.getUser() + "' AND password='" + cliente.getPassword() + "';";
           consultarBase(sql);
           
           if(resultado.next()){
               System.out.println("Bienvenido Usuario " + cliente.getUser());
               flag=false;
           }else{
               System.out.println("La contrasenia o usuario ingresados son incorrectos, intente nuevamente");
           }
       }catch(Exception e){
           System.out.println("FATAL ERROR CLOSING PROGRAM.......");
           flag=false;
       }
        i++;
        if (i==3) {
            System.out.println("sobrepaso el limite de intentos, el programa va a reiniciarse");
            flag=false;
        }
    } while (flag==true);
    return cliente;
    
}
    
    public void mostrarCitas(){
        String sql="SELECT citad_id, mes, dia, horario FROM citas_disponibles WHERE disponible = 1";
        try {
            // ejecuto la consulta y obtengo los resultados
            consultarBase(sql);
            //Obtengo los metadatos de la tabla
            ResultSetMetaData metaData = resultado.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Definir el ancho fijo para cada columna
            int[] anchosColumnas = {10, 20, 20, 10};
            System.out.println("---------Citas Disponibles-----------");

            for (int i = 1; i <= columnCount; i++) {
                String nombreColumna = metaData.getColumnName(i);
                System.out.printf("%-" + anchosColumnas[i - 1] + "s\t", nombreColumna);
            }
            System.out.println();

            // Imprimir los datos de la tabla
            while (resultado.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    String valorCelda = resultado.getString(i);
                    System.out.printf("%-" + anchosColumnas[i - 1] + "s\t", valorCelda);
                }
                System.out.println();
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int seleccionCita(){
        Scanner read = new Scanner(System.in);
        int x;
        boolean flag=true;
        String resp;
        do {
        System.out.println("Seleccione el id de la cita que quiere agendar");
        x=read.nextInt();
        System.out.println("Usted selecciono la cita numero " + x);
        System.out.println("esta seguro?");
        System.out.println("Ingrese Si o No");
        resp=read.next();
            if (resp.equalsIgnoreCase("si")) {
                flag=false;
            }
            else{
            }
        } while (flag);
       
        return x;
    }
    
    public void agendarCita(int agendar,String cliente){

        try{
          String sql="UPDATE citas_disponibles SET disponible = false WHERE citad_id = " + agendar +";";
          insertarModificarEliminar(sql);
          String sql1="UPDATE citas_disponibles SET user = '" + cliente +"' WHERE citad_id = " + agendar +";";
           insertarModificarEliminar(sql1);
                System.out.println("Exelente! cita reservada");
                System.out.println("Muchas Gracias!");

        } catch (Exception e) {
           
        }
        
    }
    
   
   
   
   
} // Class End


