package ar.edu.unlam.pb2.cuenta2;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestCuenta {

	
	@Test
	public void queSePuedaCrearUnaCuentaSueldo() {
		CuentaSueldo2 cuentaSueldo = new CuentaSueldo2("Anto");
		assertNotNull(cuentaSueldo);
	}
	
	@Test
	public void queSePuedaCrearUnaCuentaCorriente() {
		CuentaCorriente2 cuentaCorriente = new CuentaCorriente2("Anto");
		assertNotNull(cuentaCorriente);
	}
	
	@Test
	public void queSePuedaCrearUnaCajaDeAhorro() {
		CajaDeAhorro2 cajaDeAhorro = new CajaDeAhorro2("Anto");
		assertNotNull(cajaDeAhorro);
	}
	
	
}
