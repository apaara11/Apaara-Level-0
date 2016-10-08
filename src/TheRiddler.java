import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer=JOptionPane.showInputDialog ("what runs but never walks,what has a bed but never sleeps, and what has a mouth but never eats.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equals("a river")){
		JOptionPane.showMessageDialog(null, "CORRECT");
		score=score+ 40;
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score is...." + score);
	}
}
