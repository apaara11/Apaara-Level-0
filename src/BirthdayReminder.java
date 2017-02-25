
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "August 14";
		String dadsBirthday = "August 13";
		String myBirthday = "May 11";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String Question = JOptionPane.showInputDialog(" Do you want to know my mom's birthday, my dad's birthday,or Apaara's birthday");
		// 3. Print out what the user typed
		System.out.println(Question);
		// 4. if user asked for "mom"
		if (Question.equals("mom's")) {

			// print mom's birthday
			JOptionPane.showMessageDialog(null, "August 14");
		}
		// 5. if user asked for "dad"
		if (Question.equals("dad's")) {

			// print dad's birthday
			JOptionPane.showMessageDialog(null, "August 13");
		}
		// 6. if user asked for your name
		// print myBirthday
		if (Question.equals("Apaara's")) {
			JOptionPane.showMessageDialog(null, "May 11");
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showConfirmDialog(null, "Sorry,I dont know that birthday.");
		}
	}

}
