package ec.edu.ups.clases;

public class Cliente {

    @Override
    public String toString() {
        return "Datos del Cliente: " + "\nNombre: " + Nombre + "  \nruc: " + ruc + "  \ntelefono: " + telefono + '"';
    }
    private String Nombre;
    private String ruc;
    private int telefono;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public int getTelefono() {
        return telefono;
    }

}
