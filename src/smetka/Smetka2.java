package smetka;

import java.util.Scanner;

public class Smetka2 {
	public static void main(String[] args) {
		double smetka = 0;
		System.out.println("Vnesi sto si pazaruval vo kilogrami: ");
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Jabolki: ");
		double jabolki = t.nextDouble();
		
		System.out.print("Krushi: ");
		double krusi = t.nextDouble();
		
		System.out.print("Grozje: ");
		double grozje = t.nextDouble();
		
		smetka = jabolki*50 + krusi*60 + grozje*100;
		System.out.println("Smetkata iznesuva: " + smetka + "den");
	}
}
