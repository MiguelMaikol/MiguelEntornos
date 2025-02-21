package PracticasClase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
    private Calculadora calculadora;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() {
        calculadora = new Calculadora();
    }

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    void testSumar() {
        int resultado = calculadora.sumar(100,3);
        assertEquals(103, resultado, "La suma de 2 + 3 debería ser 5");
    }


	@Test
    void testDividir() {
        int resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado, "La división de 10 entre 2 debería ser 5");
    }


}
