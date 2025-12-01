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

    public static void main(String[] args) {
        System.out.print("Vnesi go brojot A: ");
        Scanner t = new Scanner(System.in);
        int a = t.nextInt();
        
        System.out.print("Vnesi go brojot B: ");
        int b = t.nextInt();
        
        int c = min(a, b);
        
        System.out.println("Najmaliot broj e " + c);
    }

}