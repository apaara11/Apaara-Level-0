

// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String banana=JOptionPane.showInputDialog("Do yo like bananas?");
		//2. if they say no,
		if(banana.equals("no")){
			JOptionPane.showMessageDialog(null, "YOU ARE CRAZY!");
		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		else if(banana.equals("yes")){
			String h=JOptionPane.showInputDialog("So,what is your favourite hobby?");
			JOptionPane.showMessageDialog(null, "Your hobby is much better WITH bananas");
			
			
		}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
		else{
			JOptionPane.showMessageDialog(null, "You are bananas!˙∆¨©ƒ∂´ßçƒ˙¥");
		}
	
	}

}