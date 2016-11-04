
import org.jointheleague.graphical.robot.Robot;


public class SquareRobot {
	public static void main(String[] args) throws Exception {
	
		// 1. Make a new Robot
		Robot logan=new Robot();

		// 3. Put the robot's pen down
		logan.penDown();

		// 6. Make the robot move as fast as possible

		logan.setSpeed(7);
		// 5. Do everything below here 4 times
		for(int w=0;w<4;w++){

		// 		2. Move your robot 200 pixels
		logan.move(200);

		// 		4. Turn the robot 90 degrees to the right (90 degrees)
		logan.turn(90);

	}
}
}





