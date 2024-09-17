import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        double a, b, c, median;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ievadiet a: ");
            a = sc.nextDouble();
            System.out.print("Ievadiet b: ");
            b = sc.nextDouble();
            System.out.print("Ievadiet c: ");
            c = sc.nextDouble();
            sc.close();

            if ((a >= b && a <= c) || (a <= b && a >= c)) {
                    median = a;
            }
            else if ((b >=a && b <= c) || (b <= a && b >=c)) {
                    median = b;
                }
            else {
                    median = c;
            }
            System.out.println("Mediana ir " + median);

        }
        catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
