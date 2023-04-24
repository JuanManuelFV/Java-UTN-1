import java.util.Scanner;

public class Calculadora{

	public static void main(String[] args) {
		metodos operaciones = new metodos();
		Scanner entrada = new Scanner(System.in);
		int n1, n2, resultado, opcion;
		boolean op = true;
		
		while(op){
			System.out.println("Menu Calculadora");
			System.out.println("1 - Sumar");
			System.out.println("2 - Restar");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("5 - Salir");
			opcion = entrada.nextInt();

			if (opcion == 5){
				System.out.println("Salio");
			}  else{

				switch (opcion){

					case 1:
						System.out.println("Ingrese el 1er número..");
						n1 = entrada.nextInt();
						System.out.println("Ingrese el 2do número..");
						n2 = entrada.nextInt();
						resultado = operaciones.sumar(n1, n2);
						System.out.println("La suma es: " + resultado);
						break;
					case 2:
						System.out.println("Ingrese el 1er número..");
						n1 = entrada.nextInt();
						System.out.println("Ingrese el 2do número..");
						n2 = entrada.nextInt();
						resultado = operaciones.restar(n1, n2);
						System.out.println("La resta es: " + resultado);
						break;
					case 3:
						System.out.println("Ingrese el 1er número..");
						n1 = entrada.nextInt();
						System.out.println("Ingrese el 2do número..");
						n2 = entrada.nextInt();
						resultado = operaciones.multiplicar(n1, n2);
						System.out.println("La multip es: " + resultado);
						break;
					case 4:
						System.out.println("Ingrese el 1er número..");
						n1 = entrada.nextInt();
						System.out.println("Ingrese el 2do número..");
						n2 = entrada.nextInt();
						resultado = operaciones.dividir(n1, n2);
						System.out.println("La div es: " + resultado);
						break;
					default:
						System.out.println("Opcion invalida...");
					}


				}
  			}

 		}

}
