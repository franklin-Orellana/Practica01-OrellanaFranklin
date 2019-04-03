package ec.edu.ups.clases;

import java.util.Date;

/**
 * Reservacion
 *
 * Clase le damos atributos a la clase Reservacion
 *
 * @since 2019
 * @version 2.0
 * @author Franklin Orellana
 */
public class Reservacion {// Clase la nombramos como Reservacion

    private String mesaReservada;// mesaReservada de cada objeto Reservacion
    private int numeroReserva;// numeroReserva de cada objeto Reservacion
    private Date fechaReserva;// fechaReserva de cada objeto Reservacion
    private String nombreReserva;// nombreReserva de cada objeto Reservacion

    @Override
    public String toString() {// nos sirve para enviar datos directamente al la clase principal
        return "Reservacion: " + "\nNombre de Reservacion: " + nombreReserva + "\nAsignacion de Mesa Reservada: " + mesaReservada + "\nNumero de Reservacion: " + numeroReserva + "\nFeecha de Reservacion: " + fechaReserva + '"';
    }//cierre de la clase

    public void setMesaReservada(String mesaReservada) {//metodo para establecer el SecmesaReservadacion
        this.mesaReservada = mesaReservada;//mesaReservada adopta el valor que contenga mesaReservada
    }//cierre de la clase

    public void setNumeroReserva(int numeroReserva) {//metodo para establecer el numeroReserva
        this.numeroReserva = numeroReserva;//numeroReserva adopta el valor que contenga numeroReserva
    }//cierre de la clase

    public void setFechaReserva(Date fechaReserva) {//metodo para establecer el fechaReserva
        this.fechaReserva = fechaReserva;//fechaReserva adopta el valor que contenga fechaReserva
    }//cierre de la clase

    public void setNombreReserva(String nombreReserva) {//metodo para establecer el nombreReserva
        this.nombreReserva = nombreReserva;//nombreReserva adopta el valor que contenga nombreReserva
    }//cierre de la clase

    public String getMesaReservada() {//metodo para obtener el nombreReserva del objeto Reservacion
        return mesaReservada;
    }//cierre de la clase

    public int getNumeroReserva() {//metodo para obtener el numeroReserva del objeto Reservacion
        return numeroReserva;
    }//cierre de la clase

    public Date getFechaReserva() {//metodo para obtener la fechaReserva del objeto Reservacion
        return fechaReserva;
    }//cierre de la clase

    public String getNombreReserva() {//metodo para obtener el nombreReserva del objeto Reservacion
        return nombreReserva;
    }//cierre de la clase
}//cierre de la clase
