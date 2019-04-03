package Calculator;

import java.util.Scanner;

import Calculator.operations.Operation;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("First number: ");
		Double a = s.nextDouble();
		s.nextLine();
		System.out.println("Specify operator: ");
		String op = s.nextLine();
		System.out.println("Second number: ");
		Double b = s.nextDouble();
		s.nextLine();

		Operation o = Operation.parseOperator(op);
		if (o == null) {
			System.err.println("Error");
		} else {
			o.setNumbers(a, b);
			System.out.println("Result of operation: " + o.calc());
		}
		s.close();

	}

}
