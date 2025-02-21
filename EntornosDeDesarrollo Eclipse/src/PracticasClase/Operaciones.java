package PracticasClase;


public class Operaciones {
	private static int num1;
	private static int num2;
	
	/*los constructores son especiales y se llaman
	igual que las clases, no devuelven nada (es justo lo de abajo)*/
	
	public Operaciones() { //CONSTRUCTOR
		
	}
	public Operaciones(int a, int b) {
		num1 = a;
		num2 = b;
	}
	public static int suma() {
		int resultado = num1 + num2;
		return resultado;
	}
	public static int resta() {
		int resultado = num1 - num2;
		return resultado;
	}
	public static int multiplicacion() {
		int resultado = num1 * num2;
		return resultado;
	}
	public static int dividir() {
		int resultado = num1 / num2;
		return resultado;
	}
	
}
