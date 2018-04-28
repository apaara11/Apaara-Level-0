import org.jointheleague.graphical.robot.Robot;

public class Querky {

private	Robot robot = new Robot();
private	String shape;
private	String imageURL;
	
Querky(String shape, String imageURL){
	this.shape= shape;
	this.imageURL= imageURL;
	robot.changeRobot(imageURL);
}
	
public String getShape() {
	return this.shape;
}
public void setShape(String shape) {
	this.shape=shape;
}
public String getImageURL() {
	return this.imageURL;
}
public void setImageURL(String imageURL) {
	this.imageURL=imageURL;
	robot.changeRobot(imageURL);
}
public void draw(){
	if(this.shape.equals("circle")) {
		robot.setSpeed(5000);
		robot.penDown();
		for(int i=0; i<360; i++) {
			robot.move(1);
			robot.turn(360/360);

		}
	}
}
}

