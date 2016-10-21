import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot bobby=new Robot();
	bobby.setSpeed(10);
	bobby.penUp();
	bobby.moveTo(200,500);
	bobby.penDown();
	bobby.move(240);
	bobby.turn(90);
	bobby.move(94);
	bobby.turn(90);
	bobby.move(240);
	bobby.penUp();
	bobby.moveTo(200,500);
	bobby.turn(180);
	bobby.move(140);
	bobby.turn(90);
	bobby.penDown();
	bobby.move(95);
	bobby.penUp();
	bobby.move(250);
	bobby.turn(268);
	bobby.penDown();
	bobby.move(140);
	bobby.turn(180);
	bobby.move(250);
	bobby.turn(180);
	bobby.move(100);
	bobby.turn(45);
	bobby.move(154);
	bobby.turn(180);
	bobby.move(154);
	bobby.turn(45);
	bobby.turn(235);
	bobby.move(140);
	bobby.turn(45);
}
}
