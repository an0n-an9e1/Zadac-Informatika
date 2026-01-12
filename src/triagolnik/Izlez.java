package triagolnik;

import java.util.Scanner;

public class Izlez {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		System.out.print("Vnesi strana a: ");
		double a = i.nextDouble();
		System.out.print("Vnesi strana b: ");
		double b = i.nextDouble();
		System.out.print("Vnesi strana c: ");
		double c = i.nextDouble();
		
		Vlez zadaca_1 = new Vlez(a, b, c);
		
		if (zadaca_1.rezultat()) {
			System.out.println("Postoi triagolnik so zadadenite strani.");
			
			if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
				System.out.println("I toj e pravoagolen.");
			}
			else if (a*a < b*b + c*c && b*b < a*a + c*c && c*c < a*a + b*b) {
				System.out.println("I toj e ostroagolen.");
			}
			else {
				System.out.println("I toj e tapoagolen.");
			}
		}
		else {
			System.out.println("Ne postoi triagolnik so dadenite strani.");
		}
	}
}
