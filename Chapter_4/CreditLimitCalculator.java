// 18,19,20
import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read inputs
        System.out.print("Введите номер счета: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Ввести остаток на начало месяца: ");
        int initialBalance = scanner.nextInt();
        System.out.print("Введите общую сумму начислений в текущем месяце: ");
        int charges = scanner.nextInt();
        System.out.print("Введите общую сумму кредитов в текущем месяце: ");
        int credits = scanner.nextInt();
        System.out.print("Введите допустимый кредитный лимит: ");
        int creditLimit = scanner.nextInt();

        // Рассчитать новый баланс
        int newBalance = initialBalance + charges - credits;
        System.out.println("Новый баланс: " + newBalance);

        // Проверка превышения кредитного лимита
        if (newBalance > creditLimit) {
            System.out.println("Превышение кредитного лимита");
        }
    }
}
