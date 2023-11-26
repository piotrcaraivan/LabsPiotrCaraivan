public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // Конструктор
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Получить методы
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }

    // метод toString
    @Override
    public String toString() {
        return String.format("%s %s\nномер социального страхования: %s", 
            getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
