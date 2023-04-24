public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

public class ItemCarrito extends Producto {
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        super(producto.getNombre(), producto.getPrecio());
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return getCantidad() * getPrecio();
    }
}

public class Carrito {
    private ArrayList<ItemCarrito> items;

    public Carrito() {
        items = new ArrayList<ItemCarrito>();
    }

    public void agregarItem(Producto producto, int cantidad) {
        ItemCarrito item = new ItemCarrito(producto, cantidad);
        items.add(item);
    }

    public void eliminarItem(ItemCarrito item) {
        items.remove(item);
    }

    public ArrayList<ItemCarrito> getItems() {
        return items;
    }

    public double getTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.getSubtotal();
        }
        return total;
    }
}

public class Descuento {
    private double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public double aplicarDescuento(double total) {
        return total * (1 - getPorcentaje());
    }
}

