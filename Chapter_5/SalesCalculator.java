import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Цены на каждый продукт
        double[] prices = {2.98, 4.50, 9.98, 4.49, 6.87};
        double totalSales = 0;

        while (true) {
            System.out.print("Введите номер продукта (1-5) или 0, чтобы выйти из системы: ");
            int productNumber = scanner.nextInt();

            // Дозорное значение для завершения цикла
            if (productNumber == 0) {
                break;
            }

            System.out.print("Введите количество проданного товара: ");
            int quantity = scanner.nextInt();

            // Рассчитать общий объем продаж
            double price = 0;
            switch (productNumber) {
                case 1:
                    price = prices[0];
                    break;
                case 2:
                    price = prices[1];
                    break;
                case 3:
                    price = prices[2];
                    break;
                case 4:
                    price = prices[3];
                    break;
                case 5:
                    price = prices[4];
                    break;
                default:
                    System.out.println("Неверный номер продукта.");
                    continue;
            }

            totalSales += price * quantity;
        }

        System.out.printf("Общий объем продаж: $%.2f%n", totalSales);
        scanner.close();
    }
}
