package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc = new Calculadora(10, 20);
		int resultado = calc.suma();
		assertEquals(30, resultado);
		
	}

	@Test
	void testResta() {
		Calculadora calc = new Calculadora(10, 20);
		int resultado = calc.resta();
		assertEquals(-10, resultado);
		
	}

	@Test
	void testMultiplica() {
		Calculadora calc = new Calculadora(10, 20);
		int resultado = calc.multiplica();
		assertEquals(200, resultado);
		
	}

	@Test
	void testDivide() {
		Calculadora calc = new Calculadora(10, 20);
		int resultado = calc.divide();
		assertEquals(0, resultado);
		
	}

}
