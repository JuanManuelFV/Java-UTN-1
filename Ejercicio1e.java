public class Ejercicio1e {
	 public static void main(String args[]) {
	 String cursos []={"Matemática", "Estadística","Álgebra"}; 
	 int practicas []={8,2,10};
	 	System.out.println("Promedio notas de cursos");
	 	;
	 	
	 int sum = 0;
for (int i = 0; i < practicas.length; i++) {
    sum += practicas[i];
}

int prom = sum / practicas.length;;
	 	for (int s=0;s<cursos.length;s++){
	 		System.out.println(cursos[s] + " "+practicas[s]);  } System.out.println("Su Promedio es : " +prom);
	  	}
	 }