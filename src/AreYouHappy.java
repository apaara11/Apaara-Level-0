import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String o=JOptionPane.showInputDialog("Are you happy? Write in lower case");
		if(o.equals("yes")){
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
		}
		else{
			String b=JOptionPane.showInputDialog("Do you want to be happy?");
			if(b.equals("yes")){
				JOptionPane.showMessageDialog(null, "Change something");
			}
			else{
				JOptionPane.showMessageDialog(null, "Keep Doing whatever you are doing");
			}
		}
	}

}
