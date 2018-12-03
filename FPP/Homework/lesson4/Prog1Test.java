package lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog1Test {

	@Test
	public void testCase1() {
		Prog1 m = new Prog1();
		String actual = m.merge("ace", "bdf");
		String expected = "abcdef";
		
		assertEquals(expected, actual);
	}

	@Test
	public void testCase2() {
		Prog1 m = new Prog1();
		String actual = m.merge("akd", "dky");
		String expected = "addkky";

		assertEquals(expected, actual);
	}
}
