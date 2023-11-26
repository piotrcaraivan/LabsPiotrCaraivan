import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " четное.");
        } else {
            System.out.println(number + " нечётное.");
        }
        input.close();
    }
}
