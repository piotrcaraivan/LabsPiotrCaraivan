import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Введите первое целое число: ");
        int number1 = input.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = input.nextInt();

        if (number1 > number2) {
            System.out.printf("%d больше.\n", number1);
        } else if (number2 > number1) {
            System.out.printf("%d больше.\n", number2);
        } else {
            System.out.println("Эти числа равны.");
        }
        input.close();
    }
}
