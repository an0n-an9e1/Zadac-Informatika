package z1;

import java.util.Scanner;

public class Z1_najgolem_broj {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Najgolem od N vcitani broevi.");
		
		int n, x, max = -0;
		System.out.print("Kolku broevi ke proveruvas: ");
		n = inp.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Vnesi go " + i + ". broj: ");
			x = inp.nextInt();
			
			if (x > max) {
				max = x;
			}
		}
		
		System.out.println("Najgolemiot broj e " + max);
	}

}
