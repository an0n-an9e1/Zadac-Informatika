package Natprevar;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		System.out.println("Vnesi ime na domakjinskiot klub i gradot od koj doagja: ");
		String ime1 = i.nextLine();
		String mesto1 = i.nextLine();
		
		System.out.println("Vnesi ime na drugiot klub i gradot od koj doagja: ");
		String ime2 = i.nextLine();
		String mesto2 = i.nextLine();
		
		Tim d = new Tim(ime1, mesto1);
		Tim g = new Tim(ime2, mesto2);
		KosarkarskiNatprevar finale = new KosarkarskiNatprevar(d, g);
		
		System.out.print("Vnesi poeni za domakinskiot tim: ");
		finale.domakjinPoentira(i.nextInt());
		
		System.out.print("Vnesi poeni za drugiot tim: ");
		finale.gostinPoentira(i.nextInt());
		
		finale.pobednikNaNatprevarot();
	}

}
