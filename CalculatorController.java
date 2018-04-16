import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class CalculatorController {

	private CalculatorView theView;
	private CalculatorModel theModel;

	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;

		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class

		this.theView.addCalculateListener(new CalculateListener());
		this.theView.subCalculateListener(new CalculateListener2());
	}


	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			int firstNumber, secondNumber = 0;

			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered

			try{

				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();

				theModel.addTwoNumbers(firstNumber, secondNumber);

				theView.setCalcSolution(theModel.getCalculationaddValue());

			}

			catch(NumberFormatException ex){

				System.out.println(ex);

				theView.displayErrorMessage("You Need to Enter 2 Integers");

			}

		}

	}


	class CalculateListener2 implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			int firstNumber2, secondNumber2 = 0;

			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered

			try{

				firstNumber2 = theView.getFirstNumber2();
				secondNumber2 = theView.getSecondNumber2();

				theModel.subTwoNumbers(firstNumber2, secondNumber2);

				theView.setCalcSolution2(theModel.getCalculationsubValue());


			}

			catch(NumberFormatException ex){

				System.out.println(ex);

				theView.displayErrorMessage("You Need to Enter 2 Integers");

			}

		}

	}

}
