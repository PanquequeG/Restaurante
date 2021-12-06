package ingsoftware;
public class Alimentos {

    //atributos de la calse
    private String nombre;
    private String descripcion;
    private double precio;

    //constructor para los datos
    public Alimentos(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //metodo para mostrar las variables del constructor sin los ingredientes 
    @Override
    public String toString() {
        return "\nnombre:\n " + nombre + "\nprecio: " + precio;
    }

    //metodo para mostrar loa alimentos con ingredientes 
    public String mostrarDatosDescripcion() {
        return "\nnombre:\n " + nombre + "\ndescripcion: "  + descripcion + "\nprecio: " + precio;
    }

    //metodo que es usado para conseguir la cantidad de dinero de cada alimentos 
    //se usara despues para la cuenta total
    public double getPrecio() {
        return precio;
    }

}