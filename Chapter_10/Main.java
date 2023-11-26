public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee("Петр Караиван", "Дизайнер", 1000.0);
        employees[1] = new HourlyEmployee("Анна Каренина", "Красавица", 15.0, 40);

        // Полиморфная обработка
        for (Employee emp : employees) {
            System.out.println(emp.name + ": $" + emp.earnings());
        }

        // Fнеактуальное использование интерфейса
        BonusCalculator bonusCalculator = baseAmount -> baseAmount * 0.1;
        System.out.println("Bonus: $" + bonusCalculator.calculateBonus(employees[0].earnings()));

        // Вызов статического метода интерфейса
        Employment.holidaySchedule();
    }
}