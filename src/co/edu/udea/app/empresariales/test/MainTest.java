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
	
	public void tresRomano() {
		assertEquals(main.romanoToDecimal("III"),3);
	}
	
	public void cincoRomano() {
		assertEquals(main.romanoToDecimal("V"),5);
	}

}
