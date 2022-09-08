package uke36;

import static javax.swing.JOptionPane.showInputDialog;

public class obli3 {

	public static void main(String[] args) {
		String heltall = showInputDialog("Heltall:");
		int n = Integer.parseInt(heltall);
		
		int fak = n;
		
		System.out.print(n + "! = " + n);
		
		do {
			fak = fak - 1;
			System.out.print("*" + fak);
			n = n * fak;
		}while (fak != 1);
		System.out.println("=" + n);

	}

}
