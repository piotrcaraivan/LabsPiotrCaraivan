public class Account {
    private String name; // Переменная экземпляра для имени учетной записи
    private double balance; // Переменная экземпляра для баланса

    // Конструктор
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    // Способ вывода средств
    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount <= balance) {
            balance -= withdrawalAmount;
        } else {
            System.out.println("Сумма снятия превысила остаток на счете.");
        }
    }

    // Getter для баланса
    public double getBalance() {
        return balance;
    }

    // Другие методы (например, setter для баланса, getter/setter для имени)
}

class AccountTest {
    public static void main(String[] args) {
        // Создание объектов учета
        Account myAccount = new Account("Петр Караиван", 500.0);

        // Отображение начального баланса
        System.out.println("Первоначальный баланс: " + myAccount.getBalance());

        // Тестовый вывод суммы в пределах баланса
        System.out.println("Попытка вывода средств $100...");
        myAccount.withdraw(300);
        System.out.println("Остаток после вывода средств: " + myAccount.getBalance());

        // Тестовое снятие суммы, превышающей остаток
        System.out.println("Повторная попытка вывода 300 долларов...");
        myAccount.withdraw(300);
        System.out.println("Остаток после второго снятия: " + myAccount.getBalance());
    }
}
