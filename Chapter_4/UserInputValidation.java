import java.util.Scanner;

public class UserInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.print("Введите 1 или 2: ");
            userInput = scanner.nextInt();
        } while (userInput != 1 && userInput != 2);

        System.out.println("Получен корректный входной сигнал: " + userInput);

        scanner.close();
    }
}
