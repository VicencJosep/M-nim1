import java.util.ArrayList;
import java.util.List;

public class ProductManagerImp implements ProductManager{

    @Override
    public List<Product> productsByPrice() {
        List<Product> listaProductos = new ArrayList<>();
        Collections.sort(listaProductos);

        return null;
    }

    @Override
    public List<Product> productsBySales() {
        return null;
    }

    @Override
    public void addOrder(Order order) {

    }

    @Override
    public Order processOrder() {
        return null;
    }

    @Override
    public List<Order> ordersByUser(String userId) {
        return null;
    }

    @Override
    public void addUser(String s, String name, String surname) {

    }

    @Override
    public void addProduct(String productId, String name, double price) {

    }
}
