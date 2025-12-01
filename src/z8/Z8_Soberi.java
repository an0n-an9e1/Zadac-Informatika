package z8;

public class Z8_Soberi {
	public static void main(String[] args) {
		int sum = Soberi_broevi(2, 3, 4);
		System.out.println("Sumata na trite broevi = " + sum);
	}
	
	public static int Soberi_broevi(int a, int b, int c) {
		return (a+b+c);
	}
}
