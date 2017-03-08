import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String kaur=JOptionPane.showInputDialog("Please type in a number");
String kaur6=JOptionPane.showInputDialog("Please type in another number");
int num1=Integer.parseInt(kaur);
int num2=Integer.parseInt(kaur6);

// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What do you want to do with the numbers?", "Choose one"
				+ "", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);

		
		
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation ==0)
	addition(num1,num2);
else if (operation==1)
subtraction(num1,num2);
else if (operation==2)
multiplication(num1,num2);
else if (operation==3)
division(num1,num2);
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void addition(int number1, int number2){
		int answer= number1+number2;
		JOptionPane.showMessageDialog(null, answer);
	}
	static void subtraction(int number1, int number2){
		int answer= number1-number2;
		JOptionPane.showMessageDialog(null, answer);
	}
	static void multiplication(int number1, int number2){
		int answer= number1*number2;
		JOptionPane.showMessageDialog(null, answer);
	}
	static void division(int number1, int number2){
		int answer= number1/number2;
		JOptionPane.showMessageDialog(null, answer);
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}
