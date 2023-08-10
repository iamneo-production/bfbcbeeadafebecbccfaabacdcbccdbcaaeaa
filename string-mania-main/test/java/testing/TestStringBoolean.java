package testing;



import static org.junit.Assert.*;
import org.junit.Test;

import utility.StringBoolean;

public class TestStringBoolean {
	StringBoolean sb = new StringBoolean();

	@Test
	public void testSetInputsMethod() {
		sb.setInput1("Java");
		sb.setInput2("Program");
		assertEquals("Java", sb.getInput1());
		assertEquals("Program", sb.getInput2());
		try {
			sb.setInput1(null);
			sb.setInput2(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testContainsMethod() {
		assertEquals(true, sb.contains("Java ", " "));
		assertEquals(false, sb.contains("Java", " "));
		assertEquals(true, sb.contains(" ", " "));
		try {
			sb.contains("", "");
			sb.contains("Java", "");
			sb.contains("", "Java");
		} catch (IllegalArgumentException e) {
			// System.out.println("null");
			e.printStackTrace();
		}
	}

	@Test
	public void testEndsWithMethod() {
		assertEquals(true, sb.endsWith("java", "a"));
		assertEquals(false, sb.endsWith("java", " "));
		assertEquals(false, sb.endsWith("java", "j"));
		try {
			sb.endsWith("", "");
			sb.endsWith("java", "");
			sb.endsWith("", "java");
		} catch (IllegalArgumentException e) {
			// System.out.println("null");
			e.printStackTrace();
		}
	}

	@Test
	public void testStartsWithMethod() {
		assertEquals(true, sb.startsWith("java", "j"));
		assertEquals(false, sb.startsWith("java", " "));
		assertEquals(false, sb.startsWith("java", "a"));
		try {
			sb.startsWith("", "");
			sb.startsWith("java", "");
			sb.startsWith("", "java");
		} catch (IllegalArgumentException e) {
			// System.out.println("null");
			e.printStackTrace();
		}
	}

	@Test
	public void testEqualsMethod() {
		assertEquals(true, sb.equals("java", "java"));
		assertEquals(false, sb.equals("java", " "));
		assertEquals(false, sb.equals("java", "Java"));
		try {
			sb.equals("", "");
			sb.equals("java", "");
			sb.equals("", "java");
		} catch (IllegalArgumentException e) {
			// System.out.println("null");
			e.printStackTrace();
		}
	}

	@Test
	public void testEqualsIgnoreCaseMethod() {
		assertEquals(true, sb.equalsIgnoreCase("java", "java"));
		assertEquals(false, sb.equalsIgnoreCase("java", " "));
		assertEquals(true, sb.equalsIgnoreCase("java", "Java"));
		try {
			sb.equals("", "");
			sb.equals("java", "");
			sb.equals("", "java");
		} catch (IllegalArgumentException e) {
			// System.out.println("null");
			e.printStackTrace();
		}
	}
}
