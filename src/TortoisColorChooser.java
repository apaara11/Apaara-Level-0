
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class TortoisColorChooser {
	public static void main(String[] args) {


		//3. ask the user what color they would like the tortoise to draw
		String color= JOptionPane.showInputDialog("What color would you like the square to be? Write red or pink in all Caps");
		//4. use an if/else statement to set the pen color that the user requested
		if(color.equals("RED")){
			Tortoise.setPenColor(Color.RED);
		}
		else if(color.equals("PINK")){
			Tortoise.setPenColor(Color.PINK);
		}
		else {
			Tortoise.setPenColor(Color.BLACK);
		}
//5. if the user doesn’t enter anything, choose a random color
		if(color.equals()){
			Tortoise.setPenColor("random");
		}

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)
		Tortoise.penDown();
		for (int t = 0; t < 4; t++) {
			Tortoise.move(144);
			Tortoise.turn(90);
		}
		


	}
}






