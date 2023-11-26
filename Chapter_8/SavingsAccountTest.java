public class SavingsAccountTest {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(4.0); // Установить годовую процентную ставку на 4%

        System.out.println("Ежемесячные остатки в течение одного года на 4.0%");
        System.out.println("Месяц \t\t Saver1 \t\t Saver2");

        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("%d \t\t %.2f \t\t %.2f\n", month, saver1.getSavingsBalance(), saver2.getSavingsBalance());
        }

        SavingsAccount.modifyInterestRate(5.0); // Установить годовую процентную ставку на уровне 5%

        System.out.println("\nПосле установления процентной ставки на уровне 5.0%");
        System.out.println("Месяц \t\t Saver1 \t\t Saver2");

        // Расчет процентов за следующий месяц и печать новых остатков
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("13 \t\t %.2f \t\t %.2f\n", saver1.getSavingsBalance(), saver2.getSavingsBalance());
    }

    // Вложенный класс SavingsAccount
    static class SavingsAccount {
        private static double annualInterestRate = 0.0; // Годовая процентная ставка для всех владельцев счетов
        private double savingsBalance; // Сумма, которую сберегатель в настоящее время имеет на депозите

        public SavingsAccount(double savingsBalance) {
            this.savingsBalance = savingsBalance;
        }

        public void calculateMonthlyInterest() {
            double monthlyInterest = (savingsBalance * annualInterestRate / 12);
            savingsBalance += monthlyInterest;
        }

        public static void modifyInterestRate(double newInterestRate) {
            annualInterestRate = newInterestRate / 100; // Преобразование процента в десятичную дробь
        }

        public double getSavingsBalance() {
            return savingsBalance;
        }
    }
}
