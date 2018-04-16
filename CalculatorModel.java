// The Model performs all the calculations needed
// and that is it. It doesn't know the View
// exists

public class CalculatorModel {

	// Holds the value of the sum of the numbers
	// entered in the view

	private int calculationaddValue,calculationsubValue;

	public void addTwoNumbers(int firstNumber, int secondNumber){

		calculationaddValue = firstNumber + secondNumber;

	}

	public void subTwoNumbers(int firstNumber, int secondNumber){

		calculationsubValue = firstNumber - secondNumber;

	}


	public int getCalculationaddValue(){

		return calculationaddValue;

	}

	public int getCalculationsubValue(){

		return calculationsubValue;

	}



}
