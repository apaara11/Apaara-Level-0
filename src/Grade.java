import javax.swing.JOptionPane;

public class Grade {
public static void main(String[] args) {
	String kaur= JOptionPane.showInputDialog("What is you test score?");
	int k=Integer.parseInt(kaur);
	
	if(k>=97){
		System.out.println("A+");
	}
	else if(k>=94){
		System.out.println("A");
	}
	else if(k>=90){
		System.out.println("A-");
	}
	else if(k>=87){
		System.out.println("B+");
	}
	else if(k>=83){
		System.out.println("B");
	}
	else if(k>=80){
		System.out.println("B-");
	}
	else if(k>=77){
		System.out.println("C+");
	}
	else if(k>=73){
		System.out.println("C");
	}
	else if(k>=70){
		System.out.println("C-");
	}
}
}
