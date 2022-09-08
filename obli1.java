package uke36;

import static javax.swing.JOptionPane.showInputDialog;

public class obli1 {

	public static void main(String[] args) {
		String loenn = showInputDialog("Bruttolønn:");
		int brutto = Integer.parseInt(loenn);
		
		double trinn1 = brutto/100*0.93, trinn2 = brutto/100*2.41, trinn3 = brutto/100*11.42, trinn4 = brutto/100*14.32;
		
		if (brutto <= 164100) {
			System.out.println("Du betaler ikke trinnskatt");
		} else if (brutto >= 164101 && brutto <= 230950) {
			System.out.println("Du er på trinn 1 og betaler: " + trinn1 + "kr");
		} else if (brutto >= 230951 && brutto <= 580650) {
			System.out.println("Du er på trinn 2 og betaler: " + trinn2 + "kr");
		} else if (brutto >= 58651 && brutto <= 934050) {
			System.out.println("Du er på trinn 3 og betaler: " + trinn3 + "kr");
		} else if (brutto >= 934051) {
			System.out.println("Du er på trinn 4 og betaler: " + trinn4 + "kr");
		}
		
	}

}
