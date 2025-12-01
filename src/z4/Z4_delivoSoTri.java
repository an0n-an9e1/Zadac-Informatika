package z4;
import java.util.Scanner;

public class Z4_delivoSoTri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Da se ispecatat: clenovite na niza koi ne se delivi so 3.");
		System.out.print("Vnesi broj na clenovi vo nizata ");
		int n = input.nextInt();
		
		int niza[] = new int[n];
		System.out.println("Vnesi gi clenovite vo nizata:");
		for (int i = 0; i < niza.length; i++) {
			System.out.print(i + "--> ");
			niza[i] = input.nextInt();
		}
		
		for (int i = 0; i < niza.length; i++) {
			if (niza[i] % 3 != 0) {
				System.out.println("niza["+i+"]" + "=" + niza[i]);
			}
		}
	}
}
