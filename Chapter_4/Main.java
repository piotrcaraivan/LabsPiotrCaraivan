public class Main {
    public static void main(String[] args) {
        // Part a: If-Else Statement
        int age = 70; // Example age
        if (age >= 65)
            System.out.println("Возраст больше или равен 65 годам");
        else
            System.out.println("Возраст менее 65 лет");

        // Part b: Цикл While с инкрементом внутри
        int x = 1, total = 0;
        while (x <= 10) {
            total += x;
            ++x;
        }
        System.out.println("Итого после цикла while (b): " + total);

        // Сброс переменных для следующей части
        x = 1; total = 0;

        // Part c: Еще один цикл While с инкрементом внутри
        while (x <= 100) {
            total += x;
            ++x;
        }
        System.out.println("Итого после цикла while (c): " + total);

        // Part d: Цикл While Loop с правильным увеличением/уменьшением
        int y = 10; // Пример начального значения для y
        while (y > 0) {
            System.out.println(y);
            --y; // или y--;
        }
    }
}
