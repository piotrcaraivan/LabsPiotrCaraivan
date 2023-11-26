public class Date {
    private int month; // 1-12
    private int day;   // 1-31 в зависимости от месяца
    private int year;  // любой год

    // Конструктор: Подтверждение правильного значения месяца и дня с учетом года
    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("месяц (" + month + ") должно быть 1-12");
        }
        if (day <= 0 || (day > 31 || (month == 2 && day > 29))) {
            throw new IllegalArgumentException("день (" + day + ") за пределами диапазона для указанных месяца и года");
        }
        if (month == 2 && day == 29 && !((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("день (" + day + ") за пределами диапазона для указанных месяца и года");
        }
        if (year < 1) {
            throw new IllegalArgumentException("год (" + year + ") должно быть больше 0");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Конструктор объекта Date для даты %s%n", this);
    }

    // Увеличение дня на единицу
    public void nextDay() {
        if (day < daysInMonth(month, year)) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
    }

    // Вспомогательный метод для определения количества дней в месяце
    private int daysInMonth(int month, int year) {
        int[] daysPerMonth = 
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            return 29;
        }
        return daysPerMonth[month];
    }

    // Возвращает строку вида месяц/день/год
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    // Тестовая программа
    public static void main(String[] args) {
        Date date = new Date(12, 31, 2022); // Тест конца года
        for (int i = 0; i < 3; i++) { // Увеличение и печать даты
            date.nextDay();
            System.out.println(date);
        }
    }
}
