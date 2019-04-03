package test.operation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Calculator.operations.Operation;

public class AdditionTest {

	double a = 2;
	double b = 9;

	@Test
	public void test() {

		Operation o1 = Operation.parseOperator("+");
		o1.setNumbers(a, b);

		assertEquals(o1.getName(), "addition");
		assertEquals(o1.calc(), 11, 0);

	}

}
