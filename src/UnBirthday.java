import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
String birthday=JOptionPane.showInputDialog("when is your birthday?");
if(birthday.equals("10/14")){
	JOptionPane.showMessageDialog(null, "Happy Birthday");
}
else{
	JOptionPane.showMessageDialog(null, "Happy Unbirthday");
}
}
}
