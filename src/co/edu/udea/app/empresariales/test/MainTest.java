package co.edu.udea.app.empresariales.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.app.empresariales.Main;

public class MainTest {
	Main main = new Main();
	@Test
	public void test() {
		assertEquals(main.romanoToDecimal("I"),1);
	}

}
