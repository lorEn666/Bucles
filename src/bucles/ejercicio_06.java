package bucles;

import java.util.Scanner;

public class ejercicio_06 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int contarNumeros = 0, numMax = 0;
		
		System.out.println("Introduce un número; se contarán y mostrarán todos los múltiplos de 3.");
		numMax = leer.nextInt();
		
		for (int i = 1; i < numMax; i++) {
			if (i%3==0) {
				contarNumeros++;
				System.out.println(i);
			}
		}
		
		System.out.println("Múltiplos totales: " + contarNumeros);
		
	}

}
