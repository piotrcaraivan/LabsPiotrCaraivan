public class Time2Test {
    public static void main(String[] args) {
        // Начальная установка времени и индикация
        Time2 time = new Time2(10, 30, 15);
        System.out.println("Начальное время установлено на: " + formatTime(time));

        // Тестовая установка нового времени
        time.setTime(13, 45, 20);
        System.out.println("Время после setTime: " + formatTime(time));

        // Тестовая настройка отдельных компонентов
        time.setHour(9);
        time.setMinute(58);
        time.setSecond(30);
        System.out.println("Время после установки часов, минут и секунд: " + formatTime(time));

        // Тестирование краевых случаев
        // Примечание: Эти примеры могут вызвать исключения, если ваш класс Time2 включает валидацию
        try {
            time.setHour(24);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано исключение при установке недопустимого часа: " + e.getMessage());
        }

        try {
            time.setMinute(60);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано исключение при установке недопустимой минуты: " + e.getMessage());
        }

        try {
            time.setSecond(60);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймал исключение при установке недопустимой секунды: " + e.getMessage());
        }

        // Сброс на действительное время после тестирования крайних случаев
        time.setTime(12, 0, 0);
        System.out.println("Сброс времени на действительное время: " + formatTime(time));

        // При необходимости могут быть добавлены дополнительные тесты
    }

    private static String formatTime(Time2 time) {
        return String.format("%02d:%02d:%02d", time.getHour(), time.getMinute(), time.getSecond());
    }
}
