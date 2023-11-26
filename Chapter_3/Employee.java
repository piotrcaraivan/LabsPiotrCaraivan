public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Setters and Getters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Метод расчета годовой заработной платы
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Метод увеличения заработной платы на заданный процент
    public void giveRaise(double percentage) {
        this.monthlySalary += (monthlySalary * percentage / 100);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        // Создание двух объектов Employee
        Employee employee1 = new Employee("Петр", "Караиван", 3000.0);
        Employee employee2 = new Employee("Петр", "Мартич", 3500.0);

        // Отображение начальных годовых зарплат
        System.out.println("Годовая заработная плата " + employee1.getFirstName() + " составляет: " + employee1.getYearlySalary());
        System.out.println("Годовая заработная плата " + employee2.getFirstName() + " составляет: " + employee2.getYearlySalary());

        // Повышение на 10%
        employee1.giveRaise(10);
        employee2.giveRaise(10);

        // Отображение годовых окладов после повышения
        System.out.println("Годовая заработная плата " + employee1.getFirstName() + " после повышения на 10% составляет: " + employee1.getYearlySalary());
        System.out.println("Годовая заработная плата " + employee2.getFirstName() + " после повышения на 10% составляет: " + employee2.getYearlySalary());
    }
}
