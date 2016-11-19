
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter and print
 * their boarding pass. You need to collect the following information: First name Last name Destination airport Birthday
 * (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY, M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
		String f = JOptionPane.showInputDialog("What is your name?");
		String l = JOptionPane.showInputDialog("What is your last name?");
		String d = JOptionPane.showInputDialog("Where are you going?");
		String b = JOptionPane.showInputDialog("When is your Birthday?");
		String g = JOptionPane.showInputDialog("What is your gender? write male or female");
		System.out.println(l + "/" + f + "(" + b + "," + g+")" + "\n" + d);

	}
}

/**
 * Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number
 * of passengers after each boarding pass.
 */
