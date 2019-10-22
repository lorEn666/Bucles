package bucles;

public class ejercicio_07 {

	public static void main(String[] args) {
		
		int sumaPares = 0, sumaImpares = 0;
		
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
			if (i%2==0) {
				sumaPares = sumaPares + i;
			}
			if (i%3==0) {
				sumaImpares = sumaImpares + i;
			}

		}
		
		System.out.println("Suma números pares: " + sumaPares);
		System.out.println("Suma números impares: " + sumaImpares);
		
	}
	
}
