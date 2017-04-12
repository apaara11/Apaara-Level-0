import javax.swing.JOptionPane;

public class Adventure {
public static void main(String[] args) {
	 JOptionPane.showMessageDialog(null, " Once upon a time, there lived a famous racecar driver named Devyn.\n"
			 + "She was smart and brave. You choose her life path");
	 
	int operation = JOptionPane.showOptionDialog(null, " First she has a race, but then she has to go to a grand opening of a place.\n"
			+"Choose one way for her to get there",
			"Adventure transportation ", 0,
			JOptionPane.INFORMATION_MESSAGE, null, new String[] { "limo", "race car" },
			null);
	if (operation==0){
		JOptionPane.showMessageDialog(null, "Good Choice!");
		
		int limo = JOptionPane.showOptionDialog(null, "What color would you like her limo to be?",
				"Adventure transportation ", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "pink", "white" },
				null);
		if(limo==0){
			JOptionPane.showMessageDialog(null, "GOOD CHOICE!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Bad choice. No one can tell it is her. Everyone used the same color for their limo.");
		}
	}
	if(operation==1){
		JOptionPane.showMessageDialog(null, "Sorry, she got arrested for speeding and not being tight on the turns. Her career is OVER.");
	}

	
}
}

