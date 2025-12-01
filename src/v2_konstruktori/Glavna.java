package v2_konstruktori;

public class Glavna {
    public static void main(String[] args) {
        Kvadar kv = new Kvadar();
        System.out.println("Volument " + kv.getVolumen());
        
        Kvadar kv2 = new Kvadar(2, 2, 2);
        System.out.println("Volumen_2 " + kv2.getVolumen());
    }
}
