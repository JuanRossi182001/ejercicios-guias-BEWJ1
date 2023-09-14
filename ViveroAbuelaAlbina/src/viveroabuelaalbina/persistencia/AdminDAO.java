/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viveroabuelaalbina.persistencia;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminDAO extends DAO{

    public AdminDAO() {
    }
    
    
    public void verCitasPendientes() {
        String sql = "SELECT citad_id, mes, dia, horario, user  FROM citas_disponibles WHERE disponible = 0";
        try {
            // ejecuto la consulta y obtengo los resultados
            consultarBase(sql);
            //Obtengo los metadatos de la tabla
            ResultSetMetaData metaData = resultado.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Definir el ancho fijo para cada columna
            int[] anchosColumnas = {10, 20, 20, 10, 10};
            System.out.println("---------Citas ocupadas-----------");

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

    public void consultarStockInt() throws SQLException, Exception {

        try {
            String sql = "SELECT * FROM PlantasInt;";
            // ejecuto la consulta y obtengo los resultados
            consultarBase(sql);
            //Obtengo los metadatos de la tabla
            ResultSetMetaData metaData = resultado.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Definir el ancho fijo para cada columna
            int[] anchosColumnas = {10, 20, 20, 10, 10,10};
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
            int[] anchosColumnas = {10, 20, 20, 10, 10,10};
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

    public void consultarTodo() throws Exception {
        try {
          
            System.out.println("");
            consultarStockInt();
            System.out.println("");
            System.out.println("");
            consultarStockExt();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int seleccionRegistroEliminar() {
        Scanner read = new Scanner(System.in);
        int x;
        boolean flag = true;
        String resp;
        do {
            System.out.println("Seleccione el id del registro a eliminar");
            x = read.nextInt();
            System.out.println("Usted selecciono el registro " + x);
            System.out.println("esta seguro?");
            System.out.println("Ingrese Si o No");
            resp = read.next();
            if (resp.equalsIgnoreCase("si")) {
                flag = false;
            } else {
            }
        } while (flag);

        return x;
    }

    public void eliminarRegistroExt(int seleccion) {
        try {
            String sql = "DELETE FROM PlantasExt WHERE plantaext_id=" + seleccion + ";";
            insertarModificarEliminar(sql);
            System.out.println("Registro " + seleccion + " Eliminado");
        } catch (Exception e) {
            System.out.println("Algo salio mal");
        }
    }

    public void eliminarRegistroInt(int seleccion) {
        try {
            String sql = "DELETE FROM PlantasInt WHERE plantaint_id=" + seleccion + ";";
            insertarModificarEliminar(sql);
            System.out.println("Registro " + seleccion + " Eliminado");
        } catch (Exception e) {
        System.out.println("Algo salio mal");   
        }
    }

    public void agregarRegsitroExt() {
        Scanner read = new Scanner(System.in);
        String nombre;
        String nombrec;
        double precio;
        String tamanio;
        int cantidad;
        System.out.println("Ingresar Planta de Exterior");
        System.out.println("Ingrese Nombre Comun");
        nombre = read.next();
        System.out.println("Ingrese Nombre Cientifico");
        nombrec = read.next();
        System.out.println("Ingrese Precio");
        precio = read.nextDouble();
        System.out.println("Ingrese tamanio");
        tamanio = read.next();
        System.out.println("Ingrese la cantidad de ese producto");
        cantidad=read.nextInt();
       
        try {
            String sql ="INSERT INTO PlantasExt (nombre, nombreCientifico, precio, tamanio,cantidad) VALUES ('" + nombre + "', '" + nombrec + "', " + precio + ", '" + tamanio + "',"   + cantidad +  ")";
            
            insertarModificarEliminar(sql);
        } catch (Exception e) {
           e.printStackTrace();
            System.out.println("algo salio mal");
        }
    }

    public void agregarRegsitroInt() {
        Scanner read = new Scanner(System.in);
        String nombre;
        String nombrec;
        double precio;
        String altura;
        int cantidad;
        System.out.println("Ingresar Planta de Interior");
        System.out.println("Ingrese Nombre Comun");
        nombre = read.next();
        System.out.println("Ingrese Nombre Cientifico");
        nombrec = read.next();
        System.out.println("Ingrese Precio");
        precio = read.nextDouble();
        System.out.println("Ingrese altura");
        altura = read.next();
         System.out.println("Ingrese la cantidad de ese producto");
        cantidad=read.nextInt();
        try {
            String sql = "INSERT INTO PlantasInt (nombre, nombreCientifico, precio, altura,cantidad) VALUES "
                 + "('" + nombre + "', '" + nombrec + "', " + precio + ", '" + altura +  "',"   + cantidad + ")";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            System.out.println("Algo salio mal");
        }

    }

    public void cambiarPrecioExt(int seleccion){
        Scanner read = new Scanner(System.in);
        int precioNuevo;
        System.out.println("Ingrese el nuevo precio");
        precioNuevo=read.nextInt();
        try{
            String sql="UPDATE plantasExt SET precio ="+precioNuevo +" WHERE plantaext_id=" + seleccion +";";
            insertarModificarEliminar(sql);
        }catch(Exception e){
            System.out.println("Algo salio mal");
        }
    }
    
    public void cambiarPrecioInt(int seleccion){
        Scanner read = new Scanner(System.in);
        int precioNuevo;
        System.out.println("Ingrese el nuevo precio");
        precioNuevo=read.nextInt();
        try{
            String sql="UPDATE plantasInt SET precio ="+precioNuevo +" WHERE plantaint_id=" + seleccion +";";
            insertarModificarEliminar(sql);
        }catch(Exception e){
            System.out.println("Algo salio mal");
        }
    }
     
    public void cambiarAlturaInt(int seleccion){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la altura nueva");
        String alturaNueva=read.next();
        try{
            String sql="UPDATE plantasInt SET altura = '"+ alturaNueva +"' WHERE plantaint_id=" + seleccion +";";
            insertarModificarEliminar(sql);
        }catch(Exception e){
            System.out.println("Algo salio mal");
        }
    }
    
    public void cambiarTamanioExt(int seleccion){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamanio nuevo");
        String tamanioNuevo=read.next();
        try{
            String sql="UPDATE plantasExt SET tamanio ='"+ tamanioNuevo +"' WHERE plantaext_id=" + seleccion +";";
            insertarModificarEliminar(sql);
        }catch(Exception e){
            System.out.println("Algo salio mal");
        }
    }

     public int seleccionRegistroCambiar() {
        Scanner read = new Scanner(System.in);
        int x;
        boolean flag = true;
        String resp;
        do {
            System.out.println("Seleccione el id del registro a modificar");
            x = read.nextInt();
            System.out.println("Usted selecciono el registro " + x);
            System.out.println("esta seguro?");
            System.out.println("Ingrese Si o No");
            resp = read.next();
            if (resp.equalsIgnoreCase("si")) {
                flag = false;
            } else {
            }
        } while (flag);

        return x;
    }
     
       public void mostrarCitasDisponbles(){
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
      
    public void cambiarHorarioCita(int seleccion){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el nuevo horario para la cita " + seleccion);
        String horarioNuevo=read.next();
        try{
            String sql="UPDATE citas_disponibles SET horario = '" + horarioNuevo + "' WHERE citad_id = " + seleccion;
            insertarModificarEliminar(sql);
        }catch(Exception e){
            System.out.println("algo salio mal");
        }
        
    }
    
    public void cambiarFechaCita(int seleccion){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese nuevo mes para la cita " + seleccion);
        String mesNuevo=read.next();
        System.out.println("Ingrese el nuevo dia de el mes "+ mesNuevo + " para la cita " + seleccion);
        String diaNuevo=read.next();
        try{
            String sql="UPDATE citas_disponibles SET dia = '" + diaNuevo + "', mes = '" + mesNuevo + "' WHERE citad_id = " + seleccion;
            insertarModificarEliminar(sql);
        }catch(Exception e){
            System.out.println("algo salio mal");
        }
    }
    
    public void eliminarCitas(int seleccion){
        try{
            String sql="DELETE FROM citas_disponibles WHERE citad_id=" + seleccion;
            System.out.println("cita numero " + seleccion +" eliminada");
            insertarModificarEliminar(sql);
        }catch(Exception e){
            System.out.println("algo salio mal");
            e.printStackTrace();
        }
    }
    
    public void mostrarTodasLasCitas(){
          String sql="SELECT * FROM citas_disponibles";
        try {
            // ejecuto la consulta y obtengo los resultados
            consultarBase(sql);
            //Obtengo los metadatos de la tabla
            ResultSetMetaData metaData = resultado.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Definir el ancho fijo para cada columna
            int[] anchosColumnas = {10, 20, 20, 10,10,10};
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
    
    public void cambiarCantidadExt(int seleccion){
     Scanner read = new Scanner(System.in);
      
     System.out.println("Ingrese El Nuevo Precio Para El registro Numero: " + seleccion);
     double cantidadNueva=read.nextDouble();
     try{
         String sql="UPDATE plantasExt set cantidad ='" +  cantidadNueva +"' WHERE plantaext_id" + seleccion +";";
         insertarModificarEliminar(sql);
     }catch(Exception e){
         System.out.println("Algo salio mal");
         e.printStackTrace();
         
     }
     
 }
 
    public void cambiarCantidadInt(int seleccion){
     Scanner read = new Scanner(System.in);
      
     System.out.println("Ingrese El Nuevo Precio Para El registro Numero: " + seleccion);
     double cantidadNueva=read.nextDouble();
     try{
         String sql="UPDATE plantasInt set cantidad ='" +  cantidadNueva +"' WHERE plantaint_id" + seleccion +";";
         insertarModificarEliminar(sql);
     }catch(Exception e){
         System.out.println("Algo salio mal");
         e.printStackTrace();
         
     }
     
 }
    
    public void agregarCita(){
        Scanner read = new Scanner(System.in);
        try{
            System.out.println("Ingrese el mes de la cita");
            String mes=read.nextLine();
            System.out.println("Ingrese el dia de la cita");
            String dia=read.nextLine();
            System.out.println("Ingrese el horario de la cita");
            String horario=read.nextLine();
            boolean disponible=true;
            
            String sql="INSERT INTO citas_disponibles (mes, dia, horario, disponible) VALUES ('" + mes + "', '" + dia + "', '" + horario + "', 1)";
            insertarModificarEliminar(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    }//class end  
    

