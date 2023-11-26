import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Инициализация переменных
        int counter = 0;
        int number;
        int largest = Integer.MIN_VALUE;  // Начните с наименьшего возможного целого числа

        // Входы для обработки
        while (counter < 10) {
            System.out.print("Введите целое число: ");
            number = scanner.nextInt();

            if (number > largest) {
                largest = number;  // Обновление наибольшего числа, если текущее число больше
            }

            counter++;  // Инкрементный счетчик
        }

        // Отображение наибольшего числа
        System.out.println("Наибольшее введенное число: " + largest);
        
        scanner.close();
    }
}
