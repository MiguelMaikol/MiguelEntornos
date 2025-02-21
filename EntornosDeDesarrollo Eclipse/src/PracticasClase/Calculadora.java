package PracticasClase;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a / b;
    }
}
