import javax.swing.JOptionPane;

public class IKnowWhatYouDid {
public static void main(String[] args) {
	String lazy= JOptionPane.showInputDialog("What is your name?");
	String answer= JOptionPane.showInputDialog("What did you do last Summer?");
	JOptionPane.showMessageDialog(null, "I know you " + answer + " last summer. Mwahaha!"
			+ "");
}
}
