package Oblig_1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int antall = 0; antall < 10; antall++) {

			int k = parseInt(showInputDialog("Skriv inn poengsum: "));
			

			if (k <= 100 && k >= 90) {
				showMessageDialog(null, "Du fikk karakteren:" + "\nA");
			} else if (k <= 89 && k >= 80) {
				showMessageDialog(null, "Du fikk karakteren:" + "\nB");
			}
			else if (k <= 79 && k >= 60) {
				showMessageDialog(null, "Du fikk karakteren:" + "\nC");
			} 
			else if (k <= 59 && k >= 50) {
				showMessageDialog(null, "Du fikk karakteren:" + "\nD");
			} 
			else if (k <= 49 && k >= 40) {
				showMessageDialog(null, "Du fikk karakteren:" + "\nE");
			} 
			else if (k <= 39 && k >= 0) {

				showMessageDialog(null, "Du fikk karakteren:" + "\nF");
			}
			else if (k < 0 || k > 100) {
				antall=antall-1;
				showMessageDialog(null, "Ugyldig Poengsum prøv igjen");
			}


		}
	}
}
