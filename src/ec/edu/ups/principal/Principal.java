package ec.edu.ups.principal; //package se utilizar para agrupar clases seleccionadas

/**
 * import sirve para importar clases de un paquete
 */
import ec.edu.ups.clases.Cliente;
import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.Factura;
import ec.edu.ups.clases.Menu;
import ec.edu.ups.clases.Reservacion;
import java.util.Date;
import java.util.Scanner;

public class Principal {//clase con nombre Principal

    public static void main(String[] args) { //Es el punto de entrada a un proceso o programa en la clase principal

        Scanner sc = new Scanner(System.in);// sirve para resivir datos mediante teclado
        String s = "";
        
        do {// inicio del do while para la cracion del menu
            System.out.println("              MENU                ");
            System.out.println("1.Crear un  Cliente");
            System.out.println("2.Crear un  Empleado");
            System.out.println("3.Crear un  Factura");
            System.out.println("4. Crear onjeto Menu");
            System.out.println("5. Crear objeto Reservacion");
            System.out.println("\tIngrese Opcion: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:// nos ayudara a llamar el objeto que gustemos seleccionar
                    
                    // el System.out.println nos ayuda a imprimir textos 
                    System.out.println("");
                    System.out.println("Ingrese los datos del Cliente: ");
                    System.out.println("Nombre: ");
                    System.out.println("Ruc: ");
                    System.out.println("Telefono: ");

                    System.out.println("================= ");

                    Scanner scn = new Scanner(System.in);// creo un objeto (instanciar Scanner) 
                    Cliente cliente = new Cliente();//creo un objeto (intanciar Cliente)
                    String nombre = scn.nextLine();//nos permite leer un dato de tipo String
                    //System.out.println("Nombre: "+nombre);
                    String ruc = scn.nextLine();//nos permite leer un dato de tipo String
                    //System.out.println("Ruc: "+ruc);
                    int telefono = scn.nextInt();//nos permite leer un dato de tipo Int
                    //System.out.println("Telefono: "+telefono);
                    cliente.setNombre(nombre);//asigno valores al campo cliente
                    cliente.setRuc(ruc);//asigno valores al campo cliente
                    cliente.setTelefono(telefono);//asigno valores al campo cliente

                    System.out.println("================= ");

                    System.out.println("    Datos del Cliente   ");
                    System.out.println("Nombre: " + cliente.getNombre());//imprime los datos ingresados 
                    System.out.println("Ruc: " + cliente.getRuc());//imprime los datos ingresados 
                    System.out.println("Telefono: " + cliente.getTelefono());//imprime los datos ingresados 
                    System.out.println("");
                    System.out.println("================= ");
                    System.out.println(cliente.toString());//impime los datos directamente
                    System.out.println("================= ");
                    System.out.println("");
                    break;

                case 2:
                    // el System.out.println nos ayuda a imprimir textos
                    System.out.println("");
                    System.out.println("Ingrese los datos del Empleado: ");
                    System.out.println("Nombre: ");
                    System.out.println("Seccion de Trabajo: ");
                    System.out.println("Cedula: ");
                    System.out.println("Codigo: ");

                    System.out.println("================= ");

                    Scanner sn = new Scanner(System.in);// creo un objeto (instanciar Scanner)
                    String nom = sn.nextLine();//nos permite leer un dato de tipo String
                    String sec = sn.nextLine();//nos permite leer un dato de tipo String
                    String ced = sn.nextLine();//nos permite leer un dato de tipo String
                    int cod = sn.nextInt();//nos permite leer un dato de tipo Int
                    System.out.println("");
                    Empleado empleado = new Empleado();// creo un objeto (instanciar Scanner)
                    empleado.setNombre(nom);//asigno valores al campo empleado
                    empleado.setSeccionTrabajo(sec);//asigno valores al campo empleado
                    empleado.setCedula(ced);//asigno valores al campo empleado
                    empleado.setCodigo(cod);//asigno valores al campo empleado

                    System.out.println("================= ");

                    System.out.println("    Datos del Empleado  ");
                    System.out.println("Nombre: " + empleado.getNombre());//imprime los datos ingresados 
                    System.out.println("Seccion de Trabajo: " + empleado.getSeccionTrabajo());//imprime los datos ingresados 
                    System.out.println("Cedula: " + empleado.getCedula());//imprime los datos ingresados 
                    System.out.println("Codigo: " + empleado.getCodigo());//imprime los datos ingresados 
                    System.out.println("");
                    System.out.println("================= ");
                    System.out.println(empleado.toString());//imprime los datos ingresados directamente 
                    System.out.println("================= ");
                    System.out.println("");
                    break;

                case 3:
                    // el System.out.println nos ayuda a imprimir textos
                    System.out.println("");
                    System.out.println("Ingrese los datos para la Factura: ");
                    System.out.println("Ingrese los datos del Empleado: ");
                    System.out.println("Nombre: ");
                    System.out.println("Ruc: ");
                    System.out.println("Direccion: ");
                    System.out.println("Telefono: ");
                    System.out.println("Correo Electronico: ");
                    System.out.println("Numero de Factura ");

                    System.out.println("================= ");

                    Scanner scc = new Scanner(System.in);// creo un objeto (instanciar Scanner)
                    String nomfac = scc.nextLine();//nos permite leer un dato de tipo String
                    String rucfac = scc.nextLine();//nos permite leer un dato de tipo String
                    String direcfac = scc.nextLine();//nos permite leer un dato de tipo String
                    int telefonofac = scc.nextInt();//nos permite leer un dato de tipo Int
                    String correofac = scc.nextLine();//nos permite leer un dato de tipo String
                    int numfac = scc.nextInt();//nos permite leer un dato de tipo Int
                    Factura factura = new Factura();// creo un objeto (instanciar Factura)
                    factura.setNombre(nomfac);//asigno valores al campo factura
                    factura.setRuc(rucfac);//asigno valores al campo factura
                    factura.setDireccion(direcfac);//asigno valores al campo factura
                    factura.setTelefono(telefonofac);//asigno valores al campo factura
                    factura.setCorreoElectronico(correofac);//asigno valores al campo factura
                    factura.setFecha(new Date());
                    factura.setNumeroFactura(numfac);

                    System.out.println("================= ");

                    System.out.println("    Datos Facturacion   ");
                    System.out.println("Nombre: " + factura.getNombre());//imprime los datos ingresados 
                    System.out.println("Ruc: " + factura.getRuc());//imprime los datos ingresados 
                    System.out.println("Direccion: " + factura.getDireccion());//imprime los datos ingresados 
                    System.out.println("Telefono: " + factura.getTelefono());//imprime los datos ingresados 
                    System.out.println("Correo Electronico: " + factura.getCorreoElectronico());//imprime los datos ingresados 
                    Date fecha = factura.getFecha();
                    System.out.println("Fecha: " + fecha);
                    System.out.println("Numero de Factura: " + factura.getNumeroFactura());//imprime los datos ingresados 
                    System.out.println("");
                    System.out.println("================= ");
                    System.out.println(factura.toString());//imprime los datos ingresados directamente
                    System.out.println("================= ");
                    System.out.println("");
                    break;

                case 4:
                    // el System.out.println nos ayuda a imprimir textos
                    System.out.println("");
                    System.out.println("Ingrese los datos del Menu: ");
                    System.out.println("Seccion: ");
                    System.out.println("Nombre del Plato: ");
                    System.out.println("Precio: ");

                    System.out.println("================= ");
                    Menu menu = new Menu();// creo un objeto (instanciar Menu)
                    Scanner snn = new Scanner(System.in);// creo un objeto (instanciar Scanner)
                    String seccion = snn.nextLine();//nos permite leer un dato de tipo String
                    String nombreplato = snn.nextLine();//nos permite leer un dato de tipo String
                    double precio = snn.nextDouble();//nos permite leer un dato de tipo double
                    menu.setSeccion(seccion);//asigno valores al campo menu
                    menu.setNombrePlato(nombreplato);//asigno valores al campo menu
                    menu.setPrecio(precio);//asigno valores al campo menu

                    System.out.println("================= ");

                    System.out.println("    Menu     ");
                    System.out.println("Ingrese los datos: ");//imprime los datos ingresados 
                    System.out.println("Seccion: " + menu.getSeccion());//imprime los datos ingresados 
                    System.out.println("Nombre del Plato: " + menu.getNombrePlato());//imprime los datos ingresados 
                    System.out.println("Precio: " + menu.getPrecio());//imprime los datos ingresados 
                    System.out.println("");
                    System.out.println("================= ");
                    System.out.println(menu.toString());//imprime los datos ingresados directamente
                    System.out.println("================= ");
                    System.out.println("");
                    break;

                case 5:
                    // el System.out.println nos ayuda a imprimir textos
                    System.out.println("");
                    System.out.println("Ingrese los datos del Reserva: ");
                    System.out.println("Nombre de Reservacion: ");
                    System.out.println("Asignacion de Mesa Reservada: ");
                    System.out.println("Numero de Reservacion: ");

                    System.out.println("================= ");

                    Scanner sr = new Scanner(System.in);// creo un objeto (instanciar Scanner)
                    Reservacion reservacion = new Reservacion();// creo un objeto (instanciar Reservacion)
                    String nomRes = sr.nextLine();//nos permite leer un dato de tipo String
                    String mesaRes = sr.nextLine();//nos permite leer un dato de tipo String
                    int numRes = sr.nextInt();//nos permite leer un dato de tipo Int
                    reservacion.setNombreReserva(nomRes);//asigno valores al campo reservacion
                    reservacion.setMesaReservada(mesaRes);//asigno valores al campo reservacion
                    reservacion.setNumeroReserva(numRes);//asigno valores al campo reservacion
                    reservacion.setFechaReserva(new Date());

                    System.out.println("================= ");

                    System.out.println("    Reservacon   ");
                    System.out.println("Ingrese los datos: ");
                    System.out.println("ombre de Reservacion: " + reservacion.getNombreReserva());//imprime los datos ingresados 
                    System.out.println("Asignacion de Mesa Reservada: " + reservacion.getMesaReservada());//imprime los datos ingresados 
                    System.out.println("Numero de Reservacion: " + reservacion.getNumeroReserva());//imprime los datos ingresados 
                    Date fech = reservacion.getFechaReserva();
                    System.out.println("Fecha de Reservacion: " + fech);//imprime los datos ingresados 
                    System.out.println("");
                    System.out.println("================= ");
                    System.out.println(reservacion.toString());//imprime los datos ingresados  directamente
                    System.out.println("================= ");
                    System.out.println("");
                    break;
            }
            System.out.println("Desea escoger otra opcion si/no");
            s = sc.next();
        } while (s.equalsIgnoreCase("si"));// finaliza el do while
    }
}
