package z7;

import java.util.Scanner;

public class Z7_Kamata {
	public static void main(String[] args) {
		double kamata, depozit;
		Scanner t = new Scanner(System.in);
		
		System.out.print("Vnesi ja kamatnata vo procent: ");
		kamata = t.nextDouble();
		
		System.out.print("Vnesi go pocetniot depozit: ");
		depozit = t.nextDouble();
		
		kamata = kamata/100;
		
		double kamatna_stapka = depozit*kamata;
		double total = depozit+kamatna_stapka;
		
		System.out.println("Kamatniot iznos ke bide " + kamatna_stapka + "den.");
		System.out.println("Vo total balansot ke bide " + total + "den.");
	}
	
}
