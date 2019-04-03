package ec.edu.ups.clases;

/**
 * Cliente
 *
 * Clase le damos atributos a la clase cliente
 *
 * @since 2019
 * @version 2.0
 * @author Franklin Orellana
 */
public class Cliente {// Clase la nombramos como Cliente

    @Override
    public String toString() {// nos sirve para enviar datos directamente al la clase principal
        return "Datos del Cliente: " + "\nNombre: " + Nombre + "  \nruc: " + ruc + "  \ntelefono: " + telefono + '"';
    }//cierre de la clase
    private String Nombre;// nombre de cada objeto Cliente
    private String ruc;// ruc de cada objeto Cliente
    private int telefono;// telefono de cada objeto Cliente

    public void setNombre(String Nombre) {//metodo para establecer el nombre
        this.Nombre = Nombre;//nombre adopta el valor que contenga nombre
    }//cierre de la clase

    public void setRuc(String ruc) {//metodo para establecer el ruc
        this.ruc = ruc;//ruc adopta el valor que contenga ruc
    }//cierre de la clase

    public void setTelefono(int telefono) {// metodo para establecer el telefono
        this.telefono = telefono;//telefono adopta el valor que contenga telefono
    }//cierre de la clase

    public String getNombre() {//metodo para obtener el nombre del objeto Cliente
        return Nombre;
    }//cierre de la clase

    public String getRuc() {//metodo para obtener el ruc del objeto Cliente
        return ruc;
    }//cierre de la clase

    public int getTelefono() {//metodo para obtener el telefono del objeto Cliente
        return telefono;
    }//cierre de la clase

}//cierre de la clase
