import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int miles;
        int gallons;
        double tripMPG;
        double totalMiles = 0;
        double totalGallons = 0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество пройденных миль (-1 для выхода): ");
        miles = scanner.nextInt();

        while (miles != -1) {
            System.out.println("Введите количество использованных галлонов: ");
            gallons = scanner.nextInt();

            tripMPG = (double) miles / gallons;
            System.out.printf(" Текущая поездка MPG: %.2f%n", tripMPG);

            totalMiles += miles;
            totalGallons += gallons;

            if (totalGallons != 0) {
                double totalMPG = totalMiles / totalGallons;
                System.out.printf("Комбинированный MPG: %.2f%n", totalMPG);
            }

            System.out.println("\nВведите количество пройденных километров (-1 для демонстрации итогов): ");
            miles = scanner.nextInt();
        }

        scanner.close();
    }
}
