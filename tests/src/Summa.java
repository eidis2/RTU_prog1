import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        double a, b, c, summa;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ievadiet a: ");
            a = sc.nextDouble();
            System.out.print("Ievadiet b: ");
            b = sc.nextDouble();
            System.out.print("Ievadiet c: ");
            c = sc.nextDouble();
            sc.close();

            if (a >= b && a >= c ) {
                    summa = b+c;
            }
            else if (b >=a && b >= c) {
                    summa = a+c;
                }
            else {
                    summa = a+b;
            }
            System.out.println("Summa ir " + summa);

        }
        catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
