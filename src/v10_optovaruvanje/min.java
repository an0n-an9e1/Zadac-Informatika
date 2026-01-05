package v10_optovaruvanje;

public class min {
	int min;
	void minFun(int n1, int n2) {
		min = n1;
		if (min > n2) {
			min = n2;
		}
		
		System.out.println("Od broevite " + n1 + " i " + n2 + " pomaliot e " + min);
	}
	void minFun(int n1, int n2, int n3) {
		min = n1;
		if (min > n2) {
			min = n2;
		}
		if (min > n3) {
			min = n3;
		}
		
		System.out.println("Od broevite " + n1 + ", " + n2 + " i " + n3 + " pomaliot e " + min);
	}
	
	public static void main(String[] args) {
		min najmal = new min();
		najmal.minFun(11, 6);
		najmal.minFun(6, 3, 4);
	}
}
