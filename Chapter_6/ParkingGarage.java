import java.util.Scanner;

public class ParkingGarage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0;
        boolean moreCustomers = true;

        while (moreCustomers) {
            System.out.print("Введите количество часов стоянки (или -1 для демонстрации итога): ");
            double hours = scanner.nextDouble();

            if (hours == -1) {
                moreCustomers = false;
            } else {
                double charge = calculateCharges(hours);
                System.out.printf("Зарядка для данного клиента: $%.2f\n", charge);
                totalReceipts += charge;
            }
        }

        System.out.printf("Общая сумма поступлений за вчерашний день: $%.2f\n", totalReceipts);
        scanner.close();
    }

    public static double calculateCharges(double hours) {
        final double MIN_FEE = 2.00;
        final double ADDITIONAL_FEE_PER_HOUR = 0.50;
        final double MAX_CHARGE = 10.00;

        if (hours <= 3) {
            return MIN_FEE;
        } else {
            double extraHours = Math.ceil(hours - 3);
            double charge = MIN_FEE + (extraHours * ADDITIONAL_FEE_PER_HOUR);
            return Math.min(charge, MAX_CHARGE);
        }
    }
}
