package ec.edu.ups.clases;

import java.util.Date;

/**
 * Cliente
 *
 * Clase le damos atributos a la clase Factura
 *
 * @since 2019
 * @version 2.0
 * @author Franklin Orellana
 */
public class Factura {// Clase la nombramos como Factura

    @Override
    public String toString() {// nos sirve para enviar datos directamente al la clase principal
        return "Datos Facturacion: " + "\t \nRuc: " + ruc + "\t \nNombre: " + nombre + "\t \nDireccion: " + direccion + "\t \nTelefono: " + telefono + "\t \nFecha: " + fecha + "\t \nNumero de Factura: " + numeroFactura + "\t\nCorreo Electronico: " + correoElectronico + '"';
    }//cierre de la clase

    private String ruc;// cedula de cada objeto Factura
    private String nombre;// nombre de cada objeto Factura
    private String direccion;// direccion de cada objeto Factura
    private int telefono;// telefono de cada objeto Factura
    private Date fecha;// fecha de cada objeto Factura
    private int numeroFactura;// numeroFactura de cada objeto Factura
    private String correoElectronico;// correoElectronico de cada objeto Factura

    public void setRuc(String ruc) {//metodo para establecer el ruc
        this.ruc = ruc;//ruc adopta el valor que contenga ruc
    }//cierre de la clase

    public void setNombre(String nombre) {//metodo para establecer el nombre
        this.nombre = nombre;//nombre adopta el valor que contenga nombre
    }//cierre de la clase

    public void setDireccion(String direccion) {//metodo para establecer la direccion
        this.direccion = direccion;//direccion adopta el valor que contenga direccion
    }//cierre de la clase

    public void setTelefono(int telefono) {//metodo para establecer el telefono
        this.telefono = telefono;//telefono adopta el valor que contenga telefono
    }//cierre de la clase

    public void setFecha(Date fecha) {//metodo para establecer el fecha
        this.fecha = fecha;//fecha adopta el valor que contenga fecha
    }//cierre de la clase

    public void setNumeroFactura(int numeroFactura) {//metodo para establecer el numeroFactura
        this.numeroFactura = numeroFactura;//numeroFactura adopta el valor que contenga numeroFactura
    }//cierre de la clase

    public void setCorreoElectronico(String correoElectronico) {//metodo para establecer el correoElectronico
        this.correoElectronico = correoElectronico;//correoElectronico adopta el valor que contenga correoElectronico
    }//cierre de la clase

    public String getRuc() {//metodo para obtener el Ruc del objeto Factura
        return ruc;
    }//cierre de la clase

    public String getNombre() {//metodo para obtener el Nombre del objeto Factura
        return nombre;
    }//cierre de la clase

    public String getDireccion() {//metodo para obtener la Direccion del objeto Factura
        return direccion;
    }//cierre de la clase

    public int getTelefono() {//metodo para obtener el Telefono del objeto Factura
        return telefono;
    }//cierre de la clase

    public Date getFecha() {//metodo para obtener la Fecha del objeto Factura
        return fecha;
    }//cierre de la clase

    public int getNumeroFactura() {//metodo para obtener el NumeroFactura del objeto Factura
        return numeroFactura;
    }//cierre de la clase

    public String getCorreoElectronico() {//metodo para obtener el CorreoElectronico del objeto Factura
        return correoElectronico;
    }//cierre de la clase

}//cierre de la clase
