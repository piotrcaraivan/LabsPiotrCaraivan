public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    // Constructor
    public CommissionEmployee(String firstName, String lastName, 
                              String socialSecurityNumber, double grossSales, 
                              double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // Переопределить метод toString
    @Override
    public String toString() {
        return String.format("%s %s\n%s: %.2f; %s: %.2f", 
            "сотрудник комиссии", super.toString(), 
            "валовые продажи", grossSales, "размер комиссии", commissionRate);
    }
}
