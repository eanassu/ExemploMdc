package exemplomdc;

public class ExemploMdc {

    public static int mdc( int x, int y ) {
        int resto = x % y;
        while( resto != 0 ) {
            x = y;
            y = resto;
            resto = x % y;
        }
        int mdc = y;
        return mdc;
    }
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a, b;
        
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("o mdc de " + a + " e " + b + " é " + mdc(a,b));
        
    }
    
}
