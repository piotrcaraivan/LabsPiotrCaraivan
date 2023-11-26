import java.util.Scanner;

public class HypotenuseCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину стороны 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Введите длину стороны 2: ");
        double side2 = scanner.nextDouble();

        double hypotenuse = hypotenuse(side1, side2);

        System.out.printf("Гипотенуза равна: %.2f\n", hypotenuse);

        scanner.close();
    }

    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
