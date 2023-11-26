public class HourlyEmployee extends Employee {
    private double hours; // Отработанные часы в неделю
    private double wage;  // Оплата труда в час

    // Constructor
    public HourlyEmployee(String firstName, String lastName, 
                          String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0) {
            throw new IllegalArgumentException("Почасовая оплата труда должна составлять >= 0.0");
        }
        if ((hours < 0.0) || (hours > 168.0)) { // 168 часов = 24 часа * 7 дней
            throw new IllegalArgumentException("Количество отработанных часов должно быть >= 0,0 и <= 168.0");
        }

        this.wage = wage;
        this.hours = hours;
    }

    // Set и get методы
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Почасовая оплата труда должна составлять >= 0.0");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)) {
            throw new IllegalArgumentException("Количество отработанных часов должно быть >= 0,0 и <= 168.0");
        }
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    // Метод расчета прибыли
    public double earnings() {
        if (getHours() <= 40) { // Без сверхурочных
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }

    // toString метод
    @Override
    public String toString() {
        return String.format("почасовой работник: %s\n%s: $%,.2f; %s: %,.2f",
            super.toString(), "почасовая оплата труда", getWage(), "отработанные часы", getHours());
    }
}
