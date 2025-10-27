package obuka;

import java.util.Scanner;

public class Dropki6 {

	public static void main(String[] args) {
		int n1, n2, n1prim, n2prim;
		Scanner t = new Scanner(System.in);
		
		System.out.print("Vnesete broitel: ");
		n1 = t.nextInt();
		System.out.print("Vnesete imenitel: ");
		n2 = t.nextInt();
		
		n1prim = n1;
		n2prim = n2;
		
		while (n1 != n2) {
			if (n1 > n2) {
				n1 -= n2;
			}
			else {
				n2 -= n1;
			}
		}
		int nzd = n1;
		
		System.out.println("NZD na broevite e: " + nzd);
		System.out.println("Skratenata dropka e: " + n1prim/nzd + "/" + n2prim/nzd);
	}
}
