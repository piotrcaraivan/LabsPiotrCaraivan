import java.util.Scanner;

public class CircleMeasurements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите радиус окружности: ");
        int radius = input.nextInt();

        System.out.printf("Диаметр: %d\n", 2 * radius);
        System.out.printf("Окружность: %f\n", 2 * Math.PI * radius);
        System.out.printf("Область: %f\n", Math.PI * radius * radius);
        input.close();
    }
}
