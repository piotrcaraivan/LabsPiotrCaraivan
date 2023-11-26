public class EmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee(
            "Петр", "Караиван", "228-69-1337", 5000, .06);

        System.out.println(employee);
    }
}
