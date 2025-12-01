package v3_metodi_2;
import java.util.Scanner;

public class V2 {
    public static void metodUspesh(double bodovi) {
        if (bodovi >= 8.5) {
            System.out.println("Odlicen");
        }
        else if (bodovi >= 7.5) {
            System.out.println("Mnogu dobar");
        }
        else if (bodovi >= 5.5) {
            System.out.println("Dobar");
        }
        else if (bodovi >= 3.5) {
            System.out.println("Dovolen");
        }
        else {
            System.out.println("Nedovolen");
        }
    }
    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("Vnesi bodovi od 1-10");
        System.out.print("Broj na bodovi: ");
        double bodovi = t.nextDouble();
        System.out.print("Za broj na bodovi " + bodovi + " uspehot e: ");
        metodUspesh(bodovi);
    }

}