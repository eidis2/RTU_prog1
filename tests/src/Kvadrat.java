import java.util.Scanner;

public class Kvadrat {
    public static void main(String[] args) {
        double a, b, c, x1, x2, d;
        Scanner sc = new Scanner(System.in);

        try {
        System.out.print("Ievadiet a: ");
        a = sc.nextDouble();
        System.out.print("Ievadiet b: ");
        b = sc.nextDouble();
        System.out.print("Ievadiet c: ");
        c = sc.nextDouble();
        sc.close();

        d = b*b - (4* a * c);

        if (d < 0) {
            System.out.println("Risinjumu nav");
        }
        else if (d == 0) {
            x1 = -b / (2*a);
            System.out.println("Sakne: " + x1);
        }
        else {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Sakne1: " + x1 + "Sakne2: " + x2);
        }
    }
    catch (Exception e) {
        System.out.println(e.toString());
        System.out.println(e.getMessage());    }
    }
    
}
