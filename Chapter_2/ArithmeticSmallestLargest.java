import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Введите первое целое число: ");
        int number1 = input.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = input.nextInt();

        System.out.print("Введите третье целое число: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        int average = sum / 3;
        int product = number1 * number2 * number3;
        int smallest = Math.min(Math.min(number1, number2), number3);
        int largest = Math.max(Math.max(number1, number2), number3);

        System.out.printf("Сумма: %d\n", sum);
        System.out.printf("Среднее: %d\n", average);
        System.out.printf("Произведение: %d\n", product);
        System.out.printf("Наименьшее: %d\n", smallest);
        System.out.printf("Наибольшее: %d\n", largest);
        input.close();
    }
}
