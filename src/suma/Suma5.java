package suma;
import java.util.Scanner;

public class Suma5 {

    public static void main(String[] args) {
        int a, b, c, d, e;
        int sumaP = 0, sumaNep = 0;

        Scanner tastatura = new Scanner(System.in);

        System.out.println("Vnesete go prviot broj:");
        a = tastatura.nextInt();

        System.out.println("Vnesete go drugiot broj:");
        b = tastatura.nextInt();

        System.out.println("Vnesete go tretiot broj:");
        c = tastatura.nextInt();

        System.out.println("Vnesete go chetvrtiot broj:");
        d = tastatura.nextInt();

        System.out.println("Vnesete go petiot broj:");
        e = tastatura.nextInt();

        // Smetanje za site broevi
        if (a % 2 == 0) { sumaP += a;}
        else { sumaNep += a; }
        
        if (b % 2 == 0) { sumaP += b;}
        else { sumaNep += b; }
        
        if (c % 2 == 0) { sumaP += c;}
        else { sumaNep += c; }
        
        if (d % 2 == 0) { sumaP += d;}
        else { sumaNep += d; }
        
        if (e % 2 == 0) { sumaP += e;}
        else { sumaNep += e; }
        

        System.out.println("Sumata na parnite broevi: " + sumaP);
        System.out.println("Sumata na neparnite broevi: " + sumaNep);
    }
}