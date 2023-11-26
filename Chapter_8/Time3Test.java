public class Time3Test {
    public static void main(String[] args) {
        // Тестовый пример a) Инкремент на следующую минуту
        Time2 time1 = new Time2(10, 59, 50);
        System.out.println("Начальное время1: " + time1);
        incrementSeconds(time1, 10); // Инкремент на следующую минуту

        // Тестовый пример b) Инкремент на следующий час
        Time2 time2 = new Time2(10, 59, 50);
        System.out.println("\nНачальное время2: " + time2);
        time2.incrementMinute();
        System.out.println("После инкрементирования минуты: " + time2);

        // Тестовый пример c) Инкремент на следующий день
        Time2 time3 = new Time2(23, 59, 50);
        System.out.println("\nНачальное время3: " + time3);
        incrementSeconds(time3, 10); // Инкремент после полуночи
    }

    private static void incrementSeconds(Time2 time, int seconds) {
        for (int i = 0; i < seconds; i++) {
            time.tick();
        }
        System.out.println("После " + seconds + " тиков: " + time);
    }

    static class Time2 {
        private int secondsSinceMidnight; // секунд с полуночи

        public Time2(int hour, int minute, int second) {
            setTime(hour, minute, second);
        }

        public void setTime(int hour, int minute, int second) {
            if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
                throw new IllegalArgumentException("час, минута и/или секунда выходят за пределы диапазона");
            }
            secondsSinceMidnight = hour * 3600 + minute * 60 + second;
        }

        public void tick() {
            secondsSinceMidnight = (secondsSinceMidnight + 1) % (24 * 3600);
        }

        public void incrementMinute() {
            secondsSinceMidnight = (secondsSinceMidnight + 60) % (24 * 3600);
        }

        public void incrementHour() {
            secondsSinceMidnight = (secondsSinceMidnight + 3600) % (24 * 3600);
        }

        public int getHour() {
            return secondsSinceMidnight / 3600;
        }

        public int getMinute() {
            return (secondsSinceMidnight % 3600) / 60;
        }

        public int getSecond() {
            return secondsSinceMidnight % 60;
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
        }
    }
}
