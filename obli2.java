package uke36;

import static javax.swing.JOptionPane.showInputDialog;

public class obli2 {

	public static void main(String[] args) {
		for (int i = 0; i <10; i++) {
			String poeng = showInputDialog("Antall poeng:");
			int tall = Integer.parseInt(poeng);
			
			if (tall <= 100 && tall >=90) {
				System.out.println("Karakter A");
			} else if (tall <= 89 && tall >= 80) {
				System.out.println("Karakter B");
			} else if (tall <=79 && tall >= 60) {
				System.out.println("Karakter C");
			} else if (tall <= 59 && tall >= 50) {
				System.out.println("Karakter D");
			} else if (tall <= 49 && tall >= 40) {
				System.out.println("Karakter E");
			} else if (tall <= 39 && tall >= 0) {
				System.out.println("Karakter F");
			} else {
				System.out.println("Feil! Poengsummen må være et gyldig tall"); i=i-1;
			}
		}

	}

}
