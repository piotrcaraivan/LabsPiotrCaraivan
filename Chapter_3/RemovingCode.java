public class RemovingCode {
    private String name;
    private double balance;

    // Constructor
    public RemovingCode(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Установщик для имени
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для баланса
    public double getBalance() {
        return balance;
    }

    // Установщик баланса
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class AccountTest1 {
    public static void main(String[] args) {
        // Создание двух учетных записей
        RemovingCode account1 = new RemovingCode("Первый счет", 50.00);
        RemovingCode account2 = new RemovingCode("Второй счет", 75.00);

        // Отображение начальных реквизитов счета
        displayRemovingCode(account1);
        displayRemovingCode(account2);

        // Предположим, что некоторые операции по счету1 и счету2 здесь
        // Например, внесение денег, снятие денег и т.д.

        // Отображение обновленных реквизитов счета
        displayRemovingCode(account1);
        displayRemovingCode(account2);
    }

    // Новый статический метод для отображения реквизитов счета
    public static void displayRemovingCode(RemovingCode accountToDisplay) {
        System.out.println("Название счета: " + accountToDisplay.getName() + ", Баланс: $" + accountToDisplay.getBalance());
    }
}
