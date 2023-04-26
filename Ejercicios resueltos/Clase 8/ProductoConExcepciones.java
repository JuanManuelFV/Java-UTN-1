import java.util.Scanner;

class Producto {
String ProdNombre;
int ProdCantidad;
double ProdPrecio;

public Producto(String ProdNombre, int ProdCantidad, double ProdPrecio){  
    this.ProdNombre = ProdNombre; 
    this.ProdCantidad= ProdCantidad; 
    this.ProdPrecio = ProdPrecio;
}
}

class itemCarrito extends Producto{
double ItemCPrecTotal;

public itemCarrito(String ProdNombre, int ProdCantidad, double ProdPrecio, double ItemCPrecTotal){
    super(ProdNombre, ProdCantidad, ProdPrecio);  
    this.ItemCPrecTotal =  ItemCPrecTotal;  		   
}
}

class Descuento extends itemCarrito {
double DescuentoDesc;

public Descuento(String ProdNombre, int ProdCantidad, double ProdPrecio, double ItemCPrecTotal, double DescuentoDesc){
    super(ProdNombre,ProdCantidad,ProdPrecio,ItemCPrecTotal);
    this.DescuentoDesc = DescuentoDesc;
}
}

public class ProductoConExcepciones {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String prodNombre;
int prodCantidad = 0;
double prodPrecio = 0;

    
    boolean nombreValido = false;
    while (!nombreValido) {
        System.out.print("Ingrese el nombre del producto: ");
        prodNombre = scanner.nextLine();
        if (prodNombre.matches("^[a-zA-Z]+$")) {
            nombreValido = true;
        } else {
            System.out.println("Error: el nombre del producto no puede contener números.");
        }
    }

   
    boolean cantidadValida = false;
    while (!cantidadValida) {
        System.out.print("Ingrese la cantidad de productos: ");
        try {
            prodCantidad = scanner.nextInt();
            cantidadValida = true;
        } catch (Exception e) {
            System.out.println("Error: la cantidad de productos debe ser un número.");
            scanner.nextLine();
        }
    }

    System.out.print("Ingrese el precio del producto: ");
    prodPrecio = scanner.nextDouble();

    Producto producto = new Producto(prodNombre, prodCantidad, prodPrecio);
    System.out.println("Producto agregado correctamente: " + producto.ProdNombre + ", " + producto.ProdCantidad + ", " + producto.ProdPrecio);
}

