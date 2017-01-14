import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String kaur=JOptionPane.showInputDialog("How old are you?");
	int poll=Integer.parseInt(kaur);
	if(poll>=18){
		JOptionPane.showInputDialog("who are you voting for?");
	}
	else{
		JOptionPane.showMessageDialog(null, "Your opinion or doesn't matter,grow up already!µ∫©˙¥∂∂åß®ƒ¥ˆ∫");
	}
	
}
}
