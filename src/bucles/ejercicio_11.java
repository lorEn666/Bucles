package bucles;

import java.util.Scanner;

public class ejercicio_11 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int factorial = 0, num = 0;
		
		System.out.println("Introduce número para calcular su factorial:");
		num = leer.nextInt();
		
		for (int i = num; i == 1; i--) {
			factorial = (i*(i-1));
		}
		
		System.out.println(factorial);
	}

}
