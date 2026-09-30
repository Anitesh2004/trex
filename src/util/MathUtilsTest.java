package util;

public class MathUtilsTest {

	public static void main(String[] args) {
		testAddPositiveNumbers();
		testAddNegativeNumbers();
		testAddPositiveAndNegative();
		testAddWithZero();
		System.out.println("MathUtilsTest: all tests passed");
	}

	private static void testAddPositiveNumbers() {
		assertEquals(5, MathUtils.add(2, 3), "2 + 3");
	}

	private static void testAddNegativeNumbers() {
		assertEquals(-5, MathUtils.add(-2, -3), "-2 + -3");
	}

	private static void testAddPositiveAndNegative() {
		assertEquals(-1, MathUtils.add(2, -3), "2 + -3");
	}

	private static void testAddWithZero() {
		assertEquals(0, MathUtils.add(0, 0), "0 + 0");
	}

	private static void assertEquals(int expected, int actual, String label) {
		if (expected != actual) {
			throw new AssertionError(label + ": expected " + expected + " but got " + actual);
		}
	}

}
