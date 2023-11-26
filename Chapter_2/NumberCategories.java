import java.util.Scanner;

public class NumberCategories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negativeCount = 0, positiveCount = 0, zeroCount = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите номер " + i + ": ");
            int number = input.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
        System.out.println("Количество нулей: " + zeroCount);
        input.close();
    }
}
