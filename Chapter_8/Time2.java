public class Time2 {
    private int secondsSinceMidnight; // секунд с полуночи

    public Time2(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Аналогичным образом могут быть модифицированы и другие конструкторы

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            secondsSinceMidnight = secondsSinceMidnight % 3600 + hour * 3600;
        } else {
            throw new IllegalArgumentException("Час должен быть равен 0-23");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            secondsSinceMidnight = getHour() * 3600 + minute * 60 + getSecond();
        } else {
            throw new IllegalArgumentException("Минута должна быть равна 0-59");
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            secondsSinceMidnight = getHour() * 3600 + getMinute() * 60 + second;
        } else {
            throw new IllegalArgumentException("Второй должен быть равен 0-59");
        }
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

    // Дополнительные методы, такие как toString, tick, incrementMinute и т.д.
    // должны быть соответствующим образом модифицированы
}
