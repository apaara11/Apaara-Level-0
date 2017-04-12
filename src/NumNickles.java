
// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;


/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class NumNickles {


	public static void main(String[] args) {


		// Ask the user how many nickels they have
String Question=JOptionPane.showInputDialog("How Many Nickles Do You Have?");

		// Convert their answer to an int using Integer.parseInt()
int Nummy5=Integer.parseInt(Question);

		// Ask the user how many dimes they have, and convert their answer
String Answer=JOptionPane.showInputDialog("How Many Dimes Do You Have");
int Nummy10=Integer.parseInt(Answer);

		// Ask the user how many quarters they have, and convert their answer
String Quarters=JOptionPane.showInputDialog("How many quarters do you have");
int Nummy25=Integer.parseInt(Quarters);
		// Calculate how much money the user has and save it in a double variable 
	 double money= .25*Nummy25 + .10*Nummy10 + .05*Nummy5;

		// Tell the user how much money they have
System.out.println("$"+ money);

	}
}



