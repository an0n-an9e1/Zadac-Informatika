package obuka;

import java.util.Scanner;

public class Smetka2 {
	public static void main(String[] args) {
		double smetka = 0;
		System.out.println("Vnesi sto si pazaruval vo kilogrami: ");
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Jabolki: ");
		double jabolki = t.nextDouble();
		
		System.out.println("Krushi: ");
		double krusi = t.nextDouble();
		
		System.out.println("Grozje: ");
		double grozje = t.nextDouble();
		
		smetka = jabolki*50 + krusi*60 + grozje*100;
		System.out.println("Smetkata iznesuva: " + smetka + "den");
	}
}
