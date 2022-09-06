package Oblig_1;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// Skattetrinn i desimal
			double trinn1 = 0.983;
			double trinn2 = 0.96;
			double trinn3 = 0.866;
			double trinn4 = 0.836;
			double trinn5 = 0.826;

			// TODO Auto-generated method stub
			double brutto = parseDouble(showInputDialog("BruttoInntekt: "));
			{

				// Trinn 0
				if (brutto > 0 && brutto <= 164100) {
					showMessageDialog(null, "Nettoinntekt: " + brutto);

				}
				// Trinn 1
				else if (brutto > 190350 && brutto < 230950) {
					brutto = brutto * trinn1;
					showMessageDialog(null, "Trinn 1. " + "\nDin Nettoinntekt: " + brutto);
				}
				// Trinn 2
				else if (brutto > 267900 && brutto < 643800) {
					brutto = brutto * trinn2;
					showMessageDialog(null, "Trinn 2. " + "\nDin Nettoinntekt: " + brutto);
				}
				// Trinn 3
				else if (brutto > 643800 && brutto < 969200) {
					brutto = brutto * trinn3;
					showMessageDialog(null, "Trinn 3. " + "\nDin Nettoinntekt: " + brutto);
				}
				// Trinn 4
				else if (brutto > 969200 && brutto < 1999999) {
					brutto = brutto * trinn4;
					showMessageDialog(null, "Trinn 4. " + "\nDin Nettoinntekt: " + brutto);
				} 
				//Trinn 5
				else if (brutto > 2000000) {
					brutto = brutto * trinn5;
					showMessageDialog(null, "Trinn 5. " + "\nDin Nettoinntekt: " + brutto);
				}
			}
		}

		{
		}
	}
