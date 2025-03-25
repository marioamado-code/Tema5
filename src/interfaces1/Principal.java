package interfaces1;

import java.util.Arrays;

public class Principal {

		public static void main(String[] args) {
		    // Crear un array de socios con diferentes id
		    Socio[] socios = new Socio[] {
		        new Socio(3, "Juan", 30),
		        new Socio(1, "Ana", 25),
		        new Socio(2, "Carlos", 35)
		    };

		    // Imprimir los socios antes de ordenar
		    System.out.println("Antes de ordenar:");
		    for (Socio socio : socios) {
		        System.out.println(socio);
		    }

		    // Ordenar el array de socios usando Arrays.sort
		    Arrays.sort(socios);

		    // Imprimir los socios después de ordenar
		    System.out.println("\nDespués de ordenar:");
		    for (Socio socio : socios) {
		        System.out.println(socio);
		    }
		}

	

}
