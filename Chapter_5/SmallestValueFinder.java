import java.util.Scanner;

public class SmallestValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос на ввод количества целых чисел
        System.out.print("Введите количество целых чисел для сравнения: ");
        int numberOfIntegers = scanner.nextInt();

        // Проверка того, ввел ли пользователь хотя бы одно целое число
        if (numberOfIntegers <= 0) {
            System.out.println("Вы должны ввести хотя бы одно целое число.");
            return;
        }

        // Инициализация наименьшего числа первым вводом пользователя
        System.out.print("Введите целое число: ");
        int smallest = scanner.nextInt();

        // Цикл для нахождения наименьшего целого числа
        for (int i = 1; i < numberOfIntegers; i++) {
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();

            if (number < smallest) {
                smallest = number; // Обновление наименьшего числа
            }
        }

        // Отображение наименьшего числа
        System.out.println("Наименьшее введенное число: " + smallest);

        scanner.close();
    }
}
