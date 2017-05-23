
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they were born. If they are over 30, tell them
 * they are too old to play this game.
 **/
public class Exam2 {
	public static void main(String[] args) {
		
		String chawla = JOptionPane.showInputDialog("How old are you?");
		
		int kaur = (Integer.parseInt(chawla));

		if (kaur >= 30) {
			System.out.println("You're too old to play  this game");
		}
		if (kaur < 30) {
			int answer = (2017 - kaur);
			JOptionPane.showMessageDialog(null, answer);
		}
	}
}
