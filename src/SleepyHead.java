
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION); /* Print “sleep in” if it is a vacation
		 * or a weekend. If it’s a weekday, print “get up lazybones!” If it is a
		 * weekday, and we are on vacation, print “sleep in”.
		 */
		int answer = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Question", JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			int respond = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Another Question", JOptionPane.YES_NO_OPTION);
			if (respond==JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(null, "sleep in");
			}
			else{
				JOptionPane.showMessageDialog(null, "Get up lazybones!");
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "sleep in.");
		}
	}
}
