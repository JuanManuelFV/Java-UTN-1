import java.util.Scanner;
import Com.Clases.Carrito;
import Com.Clases.Descuento;
import Com.Clases.ItemCarrito;
import Com.Clases.Producto;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos los productos
        Producto jabon = new Producto("Jabón en polvo", 40);
        Producto esponja = new Producto("Esponjas", 10);
        Producto chocolate = new Producto("Chocolates", 100);

        
        System.out.print("Cantidad de jabón en polvo: ");
        int cantidadJabon = scanner.nextInt();
        ItemCarrito itemJabon = new ItemCarrito(jabon, cantidadJabon);

        System.out.print("Cantidad de esponjas: ");
        int cantidadEsponjas = scanner.nextInt();
        ItemCarrito itemEsponjas = new ItemCarrito(esponja, cantidadEsponjas);

        System.out.print("Cantidad de chocolates: ");
        int cantidadChocolates = scanner.nextInt();
        ItemCarrito itemChocolates = new ItemCarrito(chocolate, cantidadChocolates);

       
        Carrito carrito = new Carrito();
        carrito.agregarItem(itemJabon);
        carrito.agregarItem(itemEsponjas);
        carrito.agregarItem(itemChocolates);

        Descuento descuento = new Descuento(10);
        double precioConDescuento = descuento.aplicarDescuento(carrito.getPrecio());

        System.out.println("Precio final con descuento del 10%: " + precioConDescuento);
}
}

