import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
	String kaur="the winning numbers are... ";
	for(int i=0;i<5;i++){
		int r=new Random().nextInt(50);
		kaur+=r+" ";
	}
	JOptionPane.showMessageDialog(null, kaur);
}
}
