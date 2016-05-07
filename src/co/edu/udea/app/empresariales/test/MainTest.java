package co.edu.udea.app.empresariales.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.app.empresariales.Main;

public class MainTest {
	Main main = new Main();
	@Test
	public void unoRomano() {
		assertEquals(main.romanoToDecimal("I"),1);
	}
	@Test
	public void tresRomano() {
		assertEquals(main.romanoToDecimal("III"),3);
	}
	@Test
	public void cincoRomano() {
		assertEquals(main.romanoToDecimal("V"),5);
	}
	@Test
	public void sieteRomano() {
		assertEquals(main.romanoToDecimal("VII"),7);
	}
	
	@Test
	public void cuatroRomano() {
		assertEquals(main.romanoToDecimal("IV"),4);
	}
	
	@Test
	public void diezRomano() {
		assertEquals(main.romanoToDecimal("X"),10);
	}
	
	@Test
	public void treintaRomano() {
		assertEquals(main.romanoToDecimal("XXX"),30);
	}
	
	@Test
	public void cincuentaRomano() {
		assertEquals(main.romanoToDecimal("L"),50);
	}
	
	@Test
	public void cienRomano() {
		assertEquals(main.romanoToDecimal("C"),100);
	}
	
	@Test
	public void quinientosRomano() {
		assertEquals(main.romanoToDecimal("D"),500);
	}
	
	@Test
	public void milRomano() {
		assertEquals(main.romanoToDecimal("M"),1000);
	}

}
