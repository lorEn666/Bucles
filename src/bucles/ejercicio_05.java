package bucles;

import java.util.Scanner;

public class ejercicio_05 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String respuesta = "";
		
		do {
			System.out.println("Introduzca S o N.");
			respuesta = leer.nextLine();
	} while ( (!respuesta.equalsIgnoreCase("S") ) && (!respuesta.equalsIgnoreCase("N") ) );
		
		System.out.println("Dato correcto.");		

	}

}
