import java.util.Scanner;

public class LargestandSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите целое число " + i + ": ");
            int number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Наибольшее количество: " + largest);
        System.out.println("Наименьшее число: " + smallest);
        input.close();
    }
}
