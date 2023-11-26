import java.util.Scanner;

public class DuplicateElimination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] uniqueNumbers = new int[5];
        int count = 0;

        while (count < uniqueNumbers.length) {
            System.out.print("Введите число от 10 до 100: ");
            int number = scanner.nextInt();

            // Валидация ввода
            if (number < 10 || number > 100) {
                System.out.println("Число должно находиться в диапазоне от 10 до 100.");
                continue;
            }

            // Проверка на наличие дубликатов
            if (!isDuplicate(uniqueNumbers, number, count)) {
                uniqueNumbers[count] = number;
                count++;

                // Вывести на экран содержимое массива
                displayArray(uniqueNumbers, count);
            }
        }

        scanner.close();
    }

    public static boolean isDuplicate(int[] array, int number, int count) {
        for (int i = 0; i < count; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static void displayArray(int[] array, int count) {
        System.out.print("Уникальные номера: ");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
