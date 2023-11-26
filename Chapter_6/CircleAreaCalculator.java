import java.util.Scanner;

public class CircleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус окружности: ");
        double radius = scanner.nextDouble();

        double area = circleArea(radius);

        System.out.printf("Площадь круга составляет: %.2f\n", area);

        scanner.close();
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
