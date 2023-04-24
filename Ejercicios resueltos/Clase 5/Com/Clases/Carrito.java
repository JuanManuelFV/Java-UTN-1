package Com.Clases;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<ItemCarrito> items = new ArrayList<>();

    public void agregarItem(ItemCarrito item) {
        items.add(item);
    }

    public double getPrecio() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.getPrecioTotal();
        }
        return total;
    }
}
