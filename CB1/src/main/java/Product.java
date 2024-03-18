public class Product {
    public String Id;
    public String Nombre;
    public  double Precio;

    public void setId (String id)
    { this.Id = id;}

    public String getId() {
        return Id;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    public Product(String id, String nombre, double precio) {
        Id = id;
        Nombre = nombre;
        Precio = precio;
    }
}
