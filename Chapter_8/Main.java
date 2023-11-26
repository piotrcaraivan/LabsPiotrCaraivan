public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        
        try {
            rectangle.setLength(10.0f);
            rectangle.setWidth(5.0f);
            System.out.println("Площадь: " + rectangle.calculateArea());
            System.out.println("Периметр: " + rectangle.calculatePerimeter());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
