import java.util.Scanner;

public class Lielakais {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ievadiet a: ");
            a = sc.nextDouble();
            System.out.print("Ievadiet b: ");
            b = sc.nextDouble();
            System.out.print("Ievadiet c: ");
            c = sc.nextDouble();
            sc.close();
            if (a >= b && a >= c) {
                System.out.println("Lielakais ir " + a);
            }
            else if (b >= a && b >= c) {
                System.out.println("Lielakais ir " + b);
            }
            else {
                System.out.println("Lielakais ir " + c);
            }
        }
        catch(Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());        }
    }
}
