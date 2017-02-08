import javax.swing.JOptionPane;

public class CreateAmethod {
public static void main(String[] args) {
	whoAreYou();
	myAge(11);
	boing("I know, right");
}
static void whoAreYou(){
	String kaur=JOptionPane.showInputDialog("what is your name");
	System.out.println(kaur+" you are outstanding! ");
}
static void myAge(int age){
	System.out.println(age);
}
static void boing(String boing){
	
	System.out.println(boing);
}




}
