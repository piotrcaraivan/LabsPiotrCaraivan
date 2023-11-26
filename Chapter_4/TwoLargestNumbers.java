import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int number;

        for (int i = 0; i < 10; i++) {
            System.out.print("Введите целое число: ");
            number = scanner.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        System.out.println("Наибольшее число: " + largest);
        System.out.println("Вторым по величине числом является: " + secondLargest);

        scanner.close();
    }
}
