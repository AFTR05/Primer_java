package ejercicio4;

public class Detallesproduct {
    Productos producto1;
    int cantidad;

    public Productos getProducto1() {
        return producto1;
    }

    public void setProducto1(Productos producto1) {
        this.producto1 = producto1;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDetallesProducto(Productos producto1,int cantidad){
        this.producto1=producto1;
        this.cantidad=cantidad;
    }
}
