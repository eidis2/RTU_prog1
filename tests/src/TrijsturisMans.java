import java.util.Scanner;

public class TrijsturisMans {
    public static void main(String[] args) {
        int x, y;
        String krasa;
        int[][] krasas = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0, 0, 0, 1, 1, 1 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 1, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 } };

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ievadiet x: ");
            x = sc.nextDouble();
            System.out.print("Ievadiet b: ");
            b = sc.nextDouble();
            System.out.print("Ievadiet c: ");
            c = sc.nextDouble();
            sc.close();

            if (a >= b && a >= c) {
                summa = b + c;
            } else if (b >= a && b >= c) {
                summa = a + c;
            } else {
                summa = a + b;
            }
            System.out.println("Summa ir " + summa);

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

        krasa = switch (krasas[y][x]) {
            case 0 -> "white";
            case 1 -> "grey";
            default -> "nav";
        };

        System.out.println("Krasa ir " + krasa);

    }
}
