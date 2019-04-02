package ec.edu.ups.clases;

import java.util.Date;

public class Factura {

    @Override
    public String toString() {
        return "Datos Facturacion: " + "\t \nRuc: " + ruc + "\t \nNombre: " + nombre + "\t \nDireccion: " + direccion + "\t \nTelefono: " + telefono + "\t \nFecha: " + fecha + "\t \nNumero de Factura: " + numeroFactura + "\t\nCorreo Electronico: " + correoElectronico + '"';
    }

    private String ruc;
    private String nombre;
    private String direccion;
    private int telefono;
    private Date fecha;
    private int numeroFactura;
    private String correoElectronico;

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getRuc() {
        return ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

}
