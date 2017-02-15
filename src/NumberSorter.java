import javax.swing.JOptionPane;

public class NumberSorter {
	public static void main(String[] args) {
		String kaur = JOptionPane.showInputDialog("Type in a random number(please?)");
		String lion = JOptionPane.showInputDialog("Type in another random number(pretty please)");
		String tiger = JOptionPane.showInputDialog("Type one more random number(pretty please with a cherry on top?)");

		int x = Integer.parseInt(kaur);
		int y = Integer.parseInt(lion);
		int z = Integer.parseInt(tiger);

		if ((x < y) && (x < z)) {
			System.out.println(x);
		}
		if ((y < x) && (y < z)) {
			System.out.println(y);
		}
		if ((z < x) && (z < y)) {
			System.out.println(z);
			//
		}
	}
}