package com.fca.calidad.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora cal;
	
	@Before 
	public void inicializar() {
		cal = new Calculadora();
	}
	

	@Test
	public void sumaTest() {
		// Ejercicio del código
		float resultadoEjecucion = cal.suma(2,2);
		float resultadoEsperado= 4.0f; 
		
		//Verificacion - comparar resultado esperado con ejecucion
		assertEquals(resultadoEsperado, resultadoEjecucion,0.01);
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void restaTest() {
		// Ejercicio del código
		float resultadoEjecucion = cal.resta(4,2);
		float resultadoEsperado= 2.0f; 
		
		//Verificacion - comparar resultado esperado con ejecucion
		assertEquals(resultadoEsperado, resultadoEjecucion,0.01);
		
	}
	
	@Test
	public void multiplicaTest() {
		// Ejercicio del código
		float resultadoEjecucion = cal.multiplica(4,2);
		float resultadoEsperado= 8.0f; 
		
		//Verificacion - comparar resultado esperado con ejecucion
		assertEquals(resultadoEsperado, resultadoEjecucion,0.01);
		
	}
	
	@Test
	public void divideTest() {
		// Ejercicio del código
		float resultadoEjecucion = cal.divide(-6,2);
		float resultadoEsperado= -3.0f; 
		
		//Verificacion - comparar resultado esperado con ejecucion
		assertEquals(resultadoEsperado, resultadoEjecucion,0.01);
		
	}

}
