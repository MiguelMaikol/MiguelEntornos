package ejericiosTema4;

import java.util.Scanner;

public class MiguelPerezGomezEjercicio4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de numeros aleatorios");
		int numeros = sc.nextInt();
		System.out.println("Introduce el valor minimo");
		int min = sc.nextInt();
		System.out.println("Introduce el valor maximo");
		int max = sc.nextInt();
		sc.close();
		double random = numerosAleatorios(numeros, min, max);
		
	}

	public static double numerosAleatorios(int numeros, int min, int max) {
		double random = 0;
		for (int i = 1; i <= numeros; i++) {
			 random = Math.floor(Math.random() * (max-min +1) + min);
			System.out.println("numero aleatorio " + i + ": " + random);
		}
		return random;
	}
}
