package ec.edu.ups.clases;

/**
 * Cliente
 *
 * Clase le damos atributos a la clase Empleado
 *
 * @since 2019
 * @version 2.0
 * @author Franklin Orellana
 */
public class Empleado {// Clase la nombramos como Empleado

    private String nombre;// nombre de cada objeto Empleado
    private String seccionTrabajo;// seccionTrabajo de cada objeto Empleado
    private String cedula;// cedula de cada objeto Empleado
    private int codigo;// codigo de cada objeto Empleado

    @Override
    public String toString() {// nos sirve para enviar datos directamente al la clase principal
        return "Datos del Empleado: " + "\nNombre: " + nombre + " \nSeccion de Trabajo: " + seccionTrabajo + " \nCedula: " + cedula + " \nCodigo: " + codigo + '"';
    }//cierre de la clase

    public void setNombre(String nombre) {//metodo para establecer el nombre
        this.nombre = nombre;//nombre adopta el valor que contenga nombre
    }//cierre de la clase

    public void setSeccionTrabajo(String seccionTrabajo) {//metodo para establecer la seccionTrabajo
        this.seccionTrabajo = seccionTrabajo;//seccionTrabajo adopta el valor que contenga seccionTrabajo
    }//cierre de la clase

    public void setCedula(String cedula) {//metodo para establecer la cedula
        this.cedula = cedula;//cedula adopta el valor que contenga cedula
    }//cierre de la clase

    public void setCodigo(int codigo) {//metodo para establecer el codigo
        this.codigo = codigo;//codigo adopta el valor que contenga codigo
    }//cierre de la clase

    public String getNombre() {//metodo para obtener el Nombre del objeto Empleadp
        return nombre;
    }//cierre de la clase

    public String getSeccionTrabajo() {//metodo para obtener la seccionTrabajo del objeto Empleado
        return seccionTrabajo;
    }//cierre de la clase

    public String getCedula() {//metodo para obtener la cedula del objeto Empleado
        return cedula;
    }//cierre de la clase

    public int getCodigo() {//metodo para obtener el codigo del objeto Empleado
        return codigo;
    }//cierre de la clase

}//cierre de la clase
