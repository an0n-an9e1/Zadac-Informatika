package z2;

public class Z2_Smetka {

	public static void main(String[] args) {
		double jabolki = 2;
		int jabolki_cena = 32;
		
		double kompiri = 5;
		int kompiri_cena = 20;
		
		double praski = 2.5;
		int praski_cena = 50;
		
		double smetka = jabolki*jabolki_cena + kompiri*kompiri_cena + praski*praski_cena;
		System.out.println("Vkupnata smetka e " + smetka + "den.");
	}

}
