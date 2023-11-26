public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
            new SalariedEmployee("Иван", "Менеджер", 1000.0),
            new HourlyEmployee("Анна", "Техник", 20.0, 40),
            new PieceWorker("Петр", "Сборщик", 5.0, 200)
        };

        // Пример использования функционального интерфейса
        BonusCalculator bonusCalculator = baseAmount -> baseAmount * 0.1;

        for (Employee emp : employees) {
            System.out.println(emp.name + ": Заработок $" + emp.earnings());
            System.out.println("Бонус: $" + bonusCalculator.calculateBonus(emp.earnings()));
            emp.joinCompany("01.01.2020");
            emp.retire();
            System.out.println();
        }

        // Вызов статического метода интерфейса
        Employment.holidaySchedule();
    }
}
