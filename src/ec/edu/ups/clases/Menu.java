package ec.edu.ups.clases;

/**
 * Cliente
 *
 * Clase le damos atributos a la clase Menu
 *
 * @since 2019
 * @version 2.0
 * @author Franklin Orellana
 */
public class Menu {// Clase la nombramos como Menu

    private String Seccion;// Seccion de cada objeto Seccion
    private String nombrePlato;// nombrePlato de cada objeto Seccion
    private String precio;// precio de cada objeto Seccion

    @Override
    public String toString() {// nos sirve para enviar datos directamente al la clase principal
        return "Menu: " + "\nSeccion: " + Seccion + "\nNombre del Plato: " + nombrePlato + "\nPrecio: " + precio + '"';
    }//cierre de la clase

    public void setSeccion(String Seccion) {//metodo para establecer el Seccion
        this.Seccion = Seccion;//Seccion adopta el valor que contenga Seccion
    }//cierre de la clase

    public void setNombrePlato(String nombrePlato) {//metodo para establecer el nombrePlato
        this.nombrePlato = nombrePlato;//nombrePlato adopta el valor que contenga nombrePlato
    }//cierre de la clase

    public void setPrecio(String precio) {//metodo para establecer el precio
        this.precio = precio;//precio adopta el valor que contenga precio
    }//cierre de la clase

    public String getSeccion() {//metodo para obtener el Seccion del objeto Seccion
        return Seccion;
    }//cierre de la clase

    public String getNombrePlato() {//metodo para obtener el NombrePlato del objeto Seccion
        return nombrePlato;
    }//cierre de la clase

    public String getPrecio() {//metodo para obtener el Precio del objeto Seccion
        return precio;
    }//cierre de la clase

}//cierre de la clase
