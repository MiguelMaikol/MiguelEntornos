package PracticasClase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class calculadora2Test {
	
	private calculadora2 calculadora2; // Si no es  estatico se pone esto
	
	@BeforeEach
	void setUp() throws Exception {
		calculadora2 = new calculadora2(6,3);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		int resultado = calculadora2.suma();
		assertEquals(9, resultado, "La suma debe de ser 9");
	}

	@Test
	void testResta() {
		int resultado = calculadora2.resta();
		assertEquals(3, resultado, "La suma debe de ser 333");
	}

	@Test
	void testMultiplica() {
		fail("Not yet implemented");
	}

	@Test
	void testDivide() {
		fail("Not yet implemented");
	}

}
