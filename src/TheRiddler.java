import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String kaur = JOptionPane.showInputDialog("What gets bigger the more you take out of it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (kaur.equals("a hole")) {
			score++;
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		if (kaur.equals("hole")) {
			score++;
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Sorry, ding dong you're wrong");
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is..." + score);
	}
}
