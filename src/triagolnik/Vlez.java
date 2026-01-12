package triagolnik;

public class Vlez {
	double a, b, c;
	
	public Vlez(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean rezultat() {
		return (a + b > c && b + c > a && c + a > b);
	}
}
