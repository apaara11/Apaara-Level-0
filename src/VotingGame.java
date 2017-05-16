import javax.swing.JOptionPane;

public class VotingGame {
	public static void main(String[] args) {
		// 2. Create and initialize variables to hold the score
		// for each of your buttons
		int cowboysScore = 0;
		int eaglesScore = 0;
		int chargersScore = 0;
		// 4. Add a loop of 1000 to allow lots of votes!
		for (int i = 0; i < 1000; i++) {
			// 1. Use showOptionDialog to ask a question that you want
			// the students in your class to vote on.
			// Fill in the button text to make a multiple choice answer.
			// Keep the 'Get score' button as your last button.
			int answer = JOptionPane.showOptionDialog(null, "What is my favorite football team", "Football", 0, 
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cowboys", "Eagles", "Chargers", "Done!" },
					null);

			// 3. Increment the score variable for the button that was pressed.
			if (answer == 0) {
				cowboysScore = cowboysScore + 1;
			}
			else if (answer == 1) {
				eaglesScore = eaglesScore + 1;
			}
			else if (answer == 2) {
				chargersScore = chargersScore + 1;
			}
			// 5. When the 'Get score' button is pressed, break out of the loop
			else{
				break;
			}
			// 6. Once the voting is done, use a pop-up to show the results.
			// Format it to look nice.
			// Reminder: \n inside your string will add a new line.
		}
			JOptionPane.showMessageDialog(null, " The votes are in! For the Cowboys, "+ cowboysScore+ " For the Eagles, "+ eaglesScore+ " For the Chargers, "+ chargersScore);
	}
}
