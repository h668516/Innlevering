package Oblig_1;

import static javax.swing.JOptionPane.showInputDialog;

public class O3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(showInputDialog("Skriv inn et heltall større enn 0: "));
		int fakultet=n;
		System.out.print(n +"!= ");
		
		for (int i= 1; i<n; i++) {
			System.out.print (i + " * ");
			 fakultet=fakultet * i;
		}
		System.out.println("");
		System.out.println("Rekkefølgen * " + n+" = "+fakultet);
	}
}
