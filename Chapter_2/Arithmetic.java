import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Введите первое целое число: ");
        int number1 = input.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = input.nextInt();

        System.out.printf("Сумма: %d\n", number1 + number2);
        System.out.printf("Произведение: %d\n", number1 * number2);
        System.out.printf("Разность: %d\n", number1 - number2);
        System.out.printf("Коэффициент: %d\n", number1 / number2);
        input.close();
    }
}
