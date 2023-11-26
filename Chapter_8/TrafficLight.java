public enum TrafficLight {
    RED(30),   // Продолжительность в секундах
    GREEN(45),
    YELLOW(10);

    private final int duration;

    // Конструктор для перечисления TrafficLight
    TrafficLight(int duration) {
        this.duration = duration;
    }

    // Геттер на время
    public int getDuration() {
        return duration;
    }
}
