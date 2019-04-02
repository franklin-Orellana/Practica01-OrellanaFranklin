package ec.edu.ups.clases;

public class Empleado {

    private String nombre;
    private String seccionTrabajo;
    private String cedula;
    private int codigo;

    @Override
    public String toString() {
        return "Datos del Empleado: " + "\nNombre: " + nombre + " \nSeccion de Trabajo: " + seccionTrabajo + " \nCedula: " + cedula + " \nCodigo: " + codigo + '"';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSeccionTrabajo(String seccionTrabajo) {
        this.seccionTrabajo = seccionTrabajo;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSeccionTrabajo() {
        return seccionTrabajo;
    }

    public String getCedula() {
        return cedula;
    }

    public int getCodigo() {
        return codigo;
    }

}
