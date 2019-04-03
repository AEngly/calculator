package test.operation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Calculator.operations.Operation;

public class OperationTest {

	@Test
	public void additiontest() {

		Operation o1 = Operation.parseOperator("+");
		assertEquals(o1.getName(), "addition");

	}

	@Test
	public void subtractiontest() {

		Operation o2 = Operation.parseOperator("-");
		assertEquals(o2.getName(), "subtraction");

	}

	@Test
	public void multiplication() {

		Operation o3 = Operation.parseOperator("*");
		assertEquals(o3.getName(), "multiplication");

	}

	@Test
	public void testnull() {

		Operation o4 = Operation.parseOperator("//");
		assertEquals(o4, null);

	}

}
