package Vezbi_1;

import java.util.Scanner;

public class Vezba_2 {
	public static void main ( String[] args ) {
		Vezba_1 zbirni = new Vezba_1();
		Scanner t = new Scanner(System.in);
		
		
		System.out.print("Vnesi go prviot broj: ");
		zbirni.setX(t.nextInt());
		System.out.print("Vnesi go vtoriot broj: ");
		zbirni.setY(t.nextInt());
		zbirni.setZ(zbirni.getX() + zbirni.getY());
		
		System.out.println(zbirni.getZ());
	}

}
