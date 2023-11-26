public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Setters
   
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getters
    
    public int getDay() {
        return day;
    }
    
    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Метод отображения даты
    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

class DateTest {
    public static void main(String[] args) {
        // Создание объекта Date
        Date today = new Date(25, 11, 2023);

        // Displaying the date
        System.out.print("Дата: ");
        today.displayDate();
    }
}
