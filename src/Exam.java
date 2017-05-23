
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.PenColors;

/* Level 0 Exam: Coding  Exercise #1 */
public class Exam {

	public static void main(String[] args) {
		Robot chawla = new Robot();
		// 3. ask the user what color they would like the Robot to draw
		String kaur = JOptionPane.showInputDialog("Which color would you like the robot to draw? cyan or pink?");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if (kaur.equals("cyan")) {
			chawla.setPenColor(PenColors.Blues.Cyan);
		}
		else{
			chawla.setPenColor(PenColors.Pinks.Pink);
		}
		// 2. set the pen width to 10
		chawla.setPenWidth(10);
		// 1. make the Robot draw a shape
		for (int i = 0; i < 4; i++) {
			chawla.setSpeed(10);
			chawla.penDown();
			chawla.hide();
			chawla.move(100);
			chawla.turn(90);
		}
	}

}
