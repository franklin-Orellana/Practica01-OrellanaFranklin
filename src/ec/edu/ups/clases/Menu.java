package ec.edu.ups.clases;

public class Menu {

    private String Seccion;
    private String nombrePlato;
    private double precio;

    @Override
    public String toString() {
        return "Menu: " + "\nSeccion: " + Seccion + "\nNombre del Plato: " + nombrePlato + "\nPrecio: " + precio + '"';
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSeccion() {
        return Seccion;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getPrecio() {
        return precio;
    }

}
