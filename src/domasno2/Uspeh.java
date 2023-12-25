package domasno2;

import java.util.Scanner;

public class Uspeh {
	public static void metodUspeh(double bodovi) {
		if(bodovi>=8.5 && bodovi<=10) {
			System.out.println("Odlicen");
		}
		else if(bodovi>=7.5 && bodovi<8.5) {
			System.out.println("Mnogu dobar");
		}
		else if(bodovi>=5.5 && bodovi<7.5) {
			System.out.println("Dobar");
		}
		else if(bodovi>=3.5 && bodovi<5.5) {
			System.out.println("Dovolen");
		}
		else if(bodovi<3.5 && bodovi<3.5)
			System.out.println("Nedovolen");
		else
		{
			System.out.println("Greska, vneseni gresen broj na mozno dobieni bodovi");
		}
	}
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Vnesi bodovi od 1-10\n");
			System.out.println("Broj na bodovi: ");
			double bodovi = input.nextDouble();
			System.out.println("Za brojot na bodovi" + bodovi + " uspehot e: ");
			metodUspeh(bodovi);
		}
		

	}
}
