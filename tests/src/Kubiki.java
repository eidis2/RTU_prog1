import java.util.Scanner;

public class Kubiki {
    static double ievade(String burts) {
        double a = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ievadiet " + burts + ":");
            a = sc.nextDouble();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        return a;
    }

    public static void main(String[] args) {
        String krasa;
        double x = ievade("x");
        double y = ievade("y");
        boolean green = (x - 5) * (x - 5) + (y - 8) * (y - 8) <= 1 && y >= 8,
                red = x >= 3 && x <= 7 && y >= 3 && y <= 7,
                blue = y >= 7 && y <= 10 && y <= 15 - x && y <= x + 5,
                window = x >= 4 && x <= 6 && y >= 4 && y <= 6;

        if (green) {
            krasa = "green";
        } else if (window) {
            krasa = "white";
        } else if (blue) {
            krasa = "blue";
        } else if (red) {
            krasa = "red";
        } else {
            krasa = "white";
        }
        System.out.println(krasa);
    }
}