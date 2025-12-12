package v1_minimum;
import java.util.Scanner;

public class V1 {
    static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }
    
    static double sredna(int a, int b, int c) {
    	return (a+b+c)/3.0;
    }

    public static void main(String[] args) {
        System.out.print("Vnesi go brojot A: ");
        Scanner t = new Scanner(System.in);
        int a = t.nextInt();
        
        System.out.print("Vnesi go brojot B: ");
        int b = t.nextInt();
        
        System.out.print("Vnesi go brojot C: ");
        int c = t.nextInt();
        
        int m = min(a, min(b, c));
        
        double s = sredna(a, b, c);
        
        System.out.println("Najmaliot broj e " + m);
        System.out.println("Srednata vrednost e " + s);    
    }
}