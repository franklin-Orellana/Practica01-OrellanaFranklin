package ec.edu.ups.clases;

import java.util.Date;

public class Reservacion {

    private String mesaReservada;
    private int numeroReserva;
    private Date fechaReserva;
    private String nombreReserva;

    @Override
    public String toString() {
        return "Reservacion: " +"\nNombre de Reservacion: " + nombreReserva + "\nAsignacion de Mesa Reservada: " + mesaReservada + "\nNumero de Reservacion: " + numeroReserva + "\nFeecha de Reservacion: " + fechaReserva + '"';
    }

    public void setMesaReservada(String mesaReservada) {
        this.mesaReservada = mesaReservada;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void setNombreReserva(String nombreReserva) {
        this.nombreReserva = nombreReserva;
    }

    public String getMesaReservada() {
        return mesaReservada;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public String getNombreReserva() {
        return nombreReserva;
    }
}
