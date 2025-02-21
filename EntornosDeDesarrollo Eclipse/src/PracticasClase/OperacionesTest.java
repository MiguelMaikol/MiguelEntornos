package PracticasClase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperacionesTest {
	 
	@BeforeEach
	void setUp() throws Exception {
        Operaciones operaciones = new Operaciones(5,7);
	}
 
	@AfterEach
	void tearDown() throws Exception {
	}
 
	@Test
	void testOperaciones() {
		fail("Not yet implemented");
	}
 
	@Test
	void testOperacionesIntInt() {
		fail("Not yet implemented");
	}
 
	@Test
	void testSuma() {
        int resultado = Operaciones.suma();
        assertEquals(12, resultado, "La suma de 5 + 7 debería ser 12");
 
	}
 
	@Test
	void testResta() {
        int resultado = Operaciones.resta();
        assertEquals(12, resultado, "La resta de 5 - 7 debería ser 12");
	}
 
	@Test
	void testMultiplicar() {
        int resultado = Operaciones.multiplicacion();
        assertEquals(12, resultado, "La suma de 5 + 7 debería ser 12");
	}
 
	@Test
	void testDividir() {
        int resultado = Operaciones.dividir();
        assertEquals(0, resultado, "La suma de 5 + 7 debería ser 12");
	}
 
}