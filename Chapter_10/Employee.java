// Функциональный интерфейс
@FunctionalInterface
interface BonusCalculator {
    double calculateBonus(double baseAmount);
}

// Интерфейс, связанный с трудоустройством
interface Employment {
    void joinCompany(String date);

    default void retire() {
        System.out.println("Сотрудник вышел на пенсию.");
    }

    static void holidaySchedule() {
        System.out.println("График отпусков общий для всех сотрудников.");
    }
}

// Абстрактный класс сотрудника
abstract class Employee implements Employment {
    protected String name;
    protected String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Абстрактный метод
    public abstract double earnings();

    @Override
    public void joinCompany(String date) {
        System.out.println(name + " присоединился " + date);
    }
}

// Наемный работник
class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, String position, double weeklySalary) {
        super(name, position);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
}

// Hourly Employee
class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String name, String position, double hourlyWage, double hoursWorked) {
        super(name, position);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double earnings() {
        return hourlyWage * hoursWorked;
    }
}