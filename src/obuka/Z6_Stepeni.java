package obuka;

import java.util.Scanner;

public class Z6_Stepeni {

	public static void main(String[] args) {
		double cel, fer;
		Scanner t = new Scanner(System.in);
		
		System.out.print("Vnesete ja temperaturata vo celsius: ");
		cel = t.nextDouble();
		
		fer = 9*cel/5 +32;
		
		System.out.println("Temp = " + fer + "*F");

	}
}
