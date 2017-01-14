

// Copyright Wintriss Technical Schools 2014
import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge.
 */

public class TortoiseWalkofFame {

	public static void main(String[] args) {

		// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to see the result of this line.
		Tortoise.setX(10);
		Tortoise.show();
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		Tortoise.setSpeed(7);
		Tortoise.penDown();
		for(int b=0;b<5;b++){
			Tortoise.penDown();
			Tortoise.move(44);
			Tortoise.turn(144);
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}

