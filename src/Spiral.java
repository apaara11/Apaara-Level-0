
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Spiral {

	public static void main(String[] args) {
Tortoise.show();
Tortoise.setSpeed(9);
Tortoise.penDown();
		// 3. Make a variable to hold the number of sides and set it to 0

		// 4. Ask the user which spiral they would like (square, triangle, or
		// pentagon)
		int answer = JOptionPane.showOptionDialog(null,
				"What shape should your spiral be?" ,
				"Spiral ", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "triangle", "pentagon","square" }, null);
				// 5. Set the number of sides depending on what the user entered
				// (multiple lines of code)
		if(answer==0){
			drawTriangle();
		}
		else if(answer==1){
			drawPentagon();
		}
		else{
			drawSquare();
		}
		// 6. If the user enters something else, say "Sorry, I don't know how to
		// draw a ..."

		// 1. Make the Tortoise draw a square spiral shape. If you get stuck,
		// use these instructions: http://bit.ly/YJUOkn
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral

	}

	public static void drawSquare() {
		for (int i = 0; i < 80; i++) {
			Tortoise.setPenColor(PenColors.getRandomColor());
			Tortoise.setPenWidth(9);
			Tortoise.move(4 * i);
			Tortoise.turn(360 / 4);
		}
	}

	public static void drawTriangle() {
		for (int i = 0; i < 80; i++) {
			Tortoise.setPenColor(PenColors.getRandomColor());
			Tortoise.move(4 * i);
			Tortoise.turn(360 / 3+1);
		}
	}

	public static void drawPentagon() {
		for (int i = 0; i < 80; i++) {
			Tortoise.setPenColor(PenColors.getRandomColor());
			Tortoise.setPenWidth(3);
			Tortoise.move(4 * i);
			Tortoise.turn(360 / 5+3);
		}

	}
}
