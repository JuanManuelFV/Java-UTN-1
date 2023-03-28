import java.util.Scanner;
public class Clase4a {
		public static void main (String[] args){
			Scanner lectura = new Scanner (System.in);{

				System.out.println("Ingrese su nombre: ");
				String nombre = lectura.next();
				System.out.println("Ingrese su edad: ");
				int edad = lectura.nextInt();
				System.out.println("Su nombre es: " + nombre + " y su edad es: " + edad);}

		}//cierra método main
	}