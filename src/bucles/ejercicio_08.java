package bucles;

import java.util.Scanner;

public class ejercicio_08 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int num = 0, numMayor = -9999999, numMenor = 9999999;
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("Introduce número " + i);
			num = leer.nextInt();
			
			if (num>numMayor) {
				numMayor = num;
			}
			
			if (num<numMenor) {
				numMenor = num;
			}
			
		}
		
		System.out.println("El mayor es: " + numMayor);
		System.out.println("El menor es: " + numMenor);
		
	}

}
