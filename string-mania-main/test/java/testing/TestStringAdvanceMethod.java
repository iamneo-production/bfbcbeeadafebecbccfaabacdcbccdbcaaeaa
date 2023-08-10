package testing;


import static org.junit.Assert.*;
import org.junit.Test;

import utility.StringAdvanceMethod;

public class TestStringAdvanceMethod {
	StringAdvanceMethod sam = new StringAdvanceMethod();

	@Test
	public void testSetInputsMethod() {
		sam.setInput1("Java");
		sam.setInput2("Program");
		assertEquals("Java", sam.getInput1());
		assertEquals("Program", sam.getInput2());
		try {
			sam.setInput1(null);
			sam.setInput2(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConcatMethod() {
		assertEquals("JavaProgram", sam.concat("Java", "Program"));
		assertEquals("Java@Program", sam.concat("Java@", "Program"));
		assertEquals("Java  Program", sam.concat("Java ", " Program"));
		try {
			sam.concat(null, null);
			sam.concat("Java", null);
			sam.concat(null, "Java");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSplitMethod() {
		assertEquals("Java  rogram", sam.split("Javaprogram", "p"));
		assertEquals("Ja  a@", sam.split("Java@", "v"));
		try {
			sam.split("Java", "");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testIndexOfMethod() {
		assertEquals("4", sam.indexOf("Javaprogram", "p"));
		assertEquals("1", sam.indexOf("Java@", "a"));
		assertEquals("4", sam.indexOf("Java ", " "));
		try {
			sam.indexOf("", "");
			sam.indexOf("Java", "");
			sam.indexOf("", "Java");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
