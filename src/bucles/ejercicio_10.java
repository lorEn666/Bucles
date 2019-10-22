package bucles;

import java.util.Scanner;

public class ejercicio_10 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String frase = "", letra = "";
		int vecesAparece = 0;
		
		System.out.println("Introduce una frase:");
		frase = leer.nextLine();
		
		System.out.println("¿Qué letra quieres buscar?");
		letra = leer.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.substring(i, i+1).equalsIgnoreCase(letra) ) {
				vecesAparece++;				
			}
			
		}
		
		System.out.println(letra + " aparece " + vecesAparece + " veces.");

	}

}
