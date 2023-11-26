import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Чтение и хранение пяти чисел
        for (int i = 0; i < 5; i++) {
            int number;
            do {
                System.out.print("Введите номер " + (i + 1) + " от 1 до 30: ");
                number = scanner.nextInt();
            } while (number < 1 || number > 30); // Цикл валидации

            numbers[i] = number;
        }

        // Отображение bar chart
        System.out.println("\nBar Chart:");
        for (int number : numbers) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println(); // Новая строка после каждого bar
        }

        scanner.close();
    }
}

