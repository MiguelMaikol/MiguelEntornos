package PracticasClase;

public class calculadora2 {
private int num1;
private int num2;
public calculadora2(int a, int b) {
num1 = a;
num2 = b;
}
public int suma() {
int resul = num1 + num2;
return resul;
}
public int resta() {
int resul = num1 - num2;
return resul;
}
public int multiplica() {
int resul = num1 * num2;
return resul;
}
public int divide() {
int resul = num1 / num2;
return resul;
}
} // fin clase