import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int number1 = input.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = input.nextInt();

        if (number1 % number2 == 0) {
            System.out.println(number1 + " кратен " + number2);
        } else {
            System.out.println(number1 + " не является кратным " + number2);
        }
        input.close();
    }
}
