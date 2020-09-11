import java.util.Scanner;

public class convertTemperature {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter celsius");
        celsius = scanner.nextDouble();
        System.out.println("enter fahrenheit");
        fahrenheit = scanner.nextDouble();

        do {
            System.out.println("Menu");
            System.out.println("1: convert from cel to fah");
            System.out.println("2: convert from fah to cel");
            System.out.println("0: exit");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("enter celsius");
                    fahrenheit = celToFah(celsius);
                    System.out.printf("%.2f cel convert to fah is %.2f",celsius,fahrenheit);
                    break;
                case 2:
                    System.out.println("enter fahrenheit");
                    celsius =fahToCel(fahrenheit);
                    System.out.printf("%.2f fah convert to cel is %.2f ",fahrenheit,celsius);
                    break;
                case 0:
                    System.exit(0);

            }
        } while (choice != 0);

    }
    public static double celToFah(double c){
        double fah = (9.0 / 5) * c + 32;
        return fah;
    }
    public static double fahToCel(double f){
        double cel = (5.0 / 9) * (f - 32);
        return cel;
    }
}
