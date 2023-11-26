public class HourlyEmployeeTest {
    public static void main(String[] args) {
        // Создание объекта HourlyEmployee
        HourlyEmployee employee = new HourlyEmployee(
            "Петр", "Караиван", "228-12-1488", 25.0, 45.0); // Example values

        System.out.println("Информация о сотрудниках, полученная полученными методами:");
        System.out.printf("%n%s %s%n", "Имя", employee.getFirstName());
        System.out.printf("%s %s%n", "Фамилия", employee.getLastName());
        System.out.printf("%s %s%n", "Номер социального страхования", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Почасовая оплата труда составляет", employee.getWage());
        System.out.printf("%s %.2f%n", "Отработанные часы - это", employee.getHours());

        System.out.printf("%n%s:%n%n%s%n", 
            "Обновленная информация о сотруднике, полученная с помощью функции toString", employee.toString());

        // Отображение доходов сотрудника
        System.out.printf("Заработок работника: $%,.2f%n", employee.earnings());
    }
}
