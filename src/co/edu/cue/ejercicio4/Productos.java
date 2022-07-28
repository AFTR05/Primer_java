package co.edu.cue.ejercicio4;

public class Productos {
    private String nombre;
    private int precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setProducto(String nombre, int precio){
        this.nombre=nombre;
        this.precio=precio;
    }
}
