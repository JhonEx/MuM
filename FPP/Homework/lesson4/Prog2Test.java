package lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog2Test {

	@Test
	public void testCase1() {
		Prog2 min = new Prog2();
		String actual = min.minimumCharacter("koud", "", 1);
		String expected = "d";

		assertEquals(expected, actual);
	}
	
	@Test
	public void testCase2() {
		Prog2 min = new Prog2();
		String actual = min.minimumCharacter("dual", "", 1);
		String expected = "a";

		assertEquals(expected, actual);
	}
}
