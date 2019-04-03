package test.operation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Calculator.operations.Operation;

public class SubtractionTest {

	double a = 2;
	double b = 9;

	@Test
	public void test() {

		Operation o3 = Operation.parseOperator("-");
		o3.setNumbers(a, b);

		assertEquals(o3.getName(), "subtraction");
		assertEquals(o3.calc(), -7, 0);

	}

}
