import java.util.Scanner;

public class Clase4c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0;

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Bienvenido " + nombre + "!");
        System.out.println("Este es el listado de productos disponibles" + "\n" + "1 kg de frutas - $200 | Código F" + "\n" + "1 kg de verduras- $350 | Código V" + "\n" + "1 gaseosa - $300 | Código G");

        String producto = "";
        while (!producto.equals("Fin")) {
            System.out.print("Ingrese código de producto que desea comprar o Fin para finalizar compra: ");
            producto = scanner.nextLine();
            if (!producto.equals("Fin")) {
                int precio = 0;
                if (producto.equals("F")) {
                    precio += 200;
                } else if (producto.equals("V")) {
                    precio += 350;
                } else if (producto.equals("G")) {
                    precio += 300;
                } else {
                    System.out.println("Producto inválido.");
                    continue;
                }
                System.out.print("Ingrese la cantidad que desea comprar: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine();
                double subtotal = precio * cantidad;
                totalCompra += subtotal;
                System.out.println("Producto comprado: " + producto);
                System.out.println("Cantidad comprada: " + cantidad);
                System.out.println("Subtotal de este producto: " + subtotal);
            }
        }

        double descuento = 0;
        if (totalCompra > 1000) {
            descuento = totalCompra * 0.2;
        }

        double totalAPagar = totalCompra - descuento;
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Total de compra: " + totalCompra);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + totalAPagar);
    }
}





