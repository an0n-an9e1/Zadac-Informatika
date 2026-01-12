package Natprevar;

public class KosarkarskiNatprevar {
	private Tim domakjin, gostin;
	private int BPdomakjin, BPgostin;
	
	public KosarkarskiNatprevar(Tim d, Tim g) {
		domakjin = d;
		gostin = g;
	}
	
	public void domakjinPoentira(int BP) {
		BPdomakjin += BP;
	}
	
	public void gostinPoentira(int BP) {
		BPgostin += BP;
	}
	
	public void pobednikNaNatprevarot() {
		if (BPdomakjin > BPgostin) {
			System.out.println("Pobednik je " + domakjin);
		}
		else if (BPdomakjin < BPgostin) {
			System.out.println("Pobednik je " + gostin);
		}
		else {
			System.out.println("Nereseno (prodolzenie");
		}
	}
}
