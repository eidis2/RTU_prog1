import java.util.Scanner;

public class TrijsturisOtrs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ievadiet skaitli x");
            int x = sc.nextInt();

            System.out.println("ievadiet skaitli y");
            int y = sc.nextInt();

            sc.close();

            boolean white;
            boolean grey;
            

            white = (x - 5) * (x - 5) + (y - 3) * (y - 3) < 4 && y >= 2;
            grey = y >= 2 && y <= 6 && y <= -x + 11 && y <= x + 1;

            if (white)
                System.out.println("white");
            else if (grey)
                System.out.println("grey");
            else
                System.out.println("white");

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

    }

}
