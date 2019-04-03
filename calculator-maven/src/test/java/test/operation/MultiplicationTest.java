package test.operation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Calculator.operations.Operation;

public class MultiplicationTest {

	double a = 2;
	double b = 9;

	@Test
	public void test() {

		Operation o2 = Operation.parseOperator("*");
		o2.setNumbers(a, b);

		assertEquals(o2.getName(), "multiplication");
		assertEquals(o2.calc(), 18, 0);

	}

}
