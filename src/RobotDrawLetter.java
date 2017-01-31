import java.awt.Color;

import org.jointheleague.graphical.robot.*;
public class RobotDrawLetter {
public static void main(String[] args) {
	RobotDrawLetter apaara=new RobotDrawLetter();
	Robot kaur=new Robot();
	System.out.println(kaur.getX()+" "+kaur.getY());
	
	kaur.setSpeed(10);
	kaur.setPenWidth(6);
	kaur.setPenColor(Color.CYAN);
	void drawLetterA{
	kaur.penDown();
	kaur.turn(20);
	kaur.move(200);
	kaur.turn(144);
	kaur.move(200);
	kaur.turn(180);
	kaur.move(100);
	kaur.turn(-86);
	kaur.move(76);
	kaur.turn(180);
	kaur.move(76);
	kaur.penUp();
	kaur.move(100);
	kaur.turn(85);
	}
	void drawLetterK{
	kaur.moveTo(1060, 512);
	kaur.turn(-166);
	kaur.setPenColor(Color.GREEN);
	kaur.penDown();
	kaur.move(200);
	kaur.turn(180);
	kaur.move(74);
	kaur.turn(-105);
	kaur.move(140);
	kaur.turn(180);
	kaur.move(140);
	kaur.turn(-105);
	kaur.move(160);
	}
	
	
	
}
}
