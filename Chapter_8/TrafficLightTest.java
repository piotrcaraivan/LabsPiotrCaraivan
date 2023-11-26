public class TrafficLightTest {
    public static void main(String[] args) {
        // Отображение всех констант светофора и их длительности
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s: %d секунд%n", light, light.getDuration());
        }
    }
}
