package Calculator.operations;

public class Multiplication extends Operation {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "multiplication";
	}

	@Override
	public String getOperator() {
		// TODO Auto-generated method stub
		return "*";
	}

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		return a * b;
	}

}
