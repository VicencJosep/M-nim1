public class Order {
    public String idProducto;
    public int cantidad;

    public String getidProducto() {
        return idProducto;
    }

    public void setidProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public int getcantidad() {
        return cantidad;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Order(String idProducto, int cantidad) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }
}
