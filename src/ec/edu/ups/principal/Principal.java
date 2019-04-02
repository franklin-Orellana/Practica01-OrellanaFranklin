package ec.edu.ups.principal;

import ec.edu.ups.clases.Cliente;
import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.Factura;
import ec.edu.ups.clases.Menu;
import ec.edu.ups.clases.Reservacion;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    
//Scanner sc=new Scanner(System.in);
  //  String nombre = sc.next();
    //String ruc = sc.next();
    //int telefono= sc.nextInt();
    
    public static void main(String[] args) {
        
    System.out.println("-------------------------------");
    System.out.println("-------------------------------");

        System.out.println("");
        Cliente cliente = new Cliente();
        cliente.setNombre("Franklin Orellana");
        cliente.setRuc("0105599914");
        cliente.setTelefono(2838601);

        System.out.println("    Datos del Cliente   ");
        System.out.println("\tNombre: " + cliente.getNombre());
        System.out.println("\tRuc: " + cliente.getRuc());
        System.out.println("\tTelefono: " + cliente.getTelefono());
        System.out.println("");
        System.out.println(cliente.toString());
        System.out.println("");
        
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");

        System.out.println("");
        Empleado empleado = new Empleado();
        empleado.setNombre("Pepito");
        empleado.setSeccionTrabajo("Mesero");
        empleado.setCedula("0105599914");
        empleado.setCodigo(1);
        
        System.out.println("    Datos del Empleado  ");
        System.out.println("\tNombre: "+ empleado.getNombre());
        System.out.println("\tSeccion de Trabajo: "+ empleado.getSeccionTrabajo());
        System.out.println("\tCedula: "+ empleado.getCedula());
        System.out.println("\tCodigo: "+ empleado.getCodigo());
        System.out.println("");
        System.out.println(empleado.toString());
        System.out.println("");
        
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        
        System.out.println("");
        Factura factura = new Factura();
        factura.setNombre("Guillermo Orellana");
        factura.setRuc("0105599914");
        factura.setDireccion("Antonio Vallejo y Eugenio Espejo");
        factura.setTelefono(2838601);
        factura.setCorreoElectronico("fg_orellana_c@hotmail.com");
        factura.setFecha(new Date());
        factura.setNumeroFactura(1);
        
        System.out.println("    Datos Facturacion   ");
        System.out.println("\tNombre: " + factura.getNombre());
        System.out.println("\tRuc: " + factura.getRuc());
        System.out.println("\tDireccion: "+ factura.getDireccion());
        System.out.println("\tTelefono: "+ factura.getTelefono());
        System.out.println("\tCorreo Electronico: "+ factura.getCorreoElectronico());
        Date fecha= factura.getFecha();
        System.out.println("\tFecha: "+ fecha);
        System.out.println("\tNumero de Factura: "+ factura.getNumeroFactura());
        System.out.println("");
        System.out.println(factura.toString());
        System.out.println("");
        
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        
        System.out.println("");
        Menu menu = new Menu();
        menu.setSeccion("Mariscos ");
        menu.setNombrePlato("Arroz Marinero");
        menu.setPrecio(7.50);
        
        System.out.println("    Menu     ");
        System.out.println("\tSeccion: "+ menu.getSeccion());
        System.out.println("\tNombre del Plato: "+ menu.getNombrePlato());
        System.out.println("\tPrecio: "+ menu.getPrecio());
        System.out.println("");
        System.out.println(menu.toString());
        System.out.println("");
        
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        
        System.out.println("");
        Reservacion reservacion = new Reservacion();
        reservacion.setNombreReserva("Franklin Orellana");
        reservacion.setMesaReservada("Mesa 2");
        reservacion.setNumeroReserva(2);
        reservacion.setFechaReserva(new Date());
        
        System.out.println("    Reservacon   ");
        System.out.println("\tNombre de Reservacion: "+ reservacion.getNombreReserva());
        System.out.println("\tAsignacion de Mesa Reservada: "+ reservacion.getMesaReservada());
        System.out.println("\tNumero de Reservacion: "+ reservacion.getNumeroReserva());
        Date fech= reservacion.getFechaReserva();
        System.out.println("\tFecha de Reservacion: "+ fech);
        System.out.println("");
        System.out.println(reservacion.toString());
        System.out.println("");
        
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
    }
}
