public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Sphere(3);

        for (Shape shape : shapes) {
            System.out.println("Форма: " + shape.getName());
            if (shape instanceof TwoDimensionalShape) {
                System.out.println("Плошадь: " + ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.println("Площадь: " + threeDShape.getArea());
                System.out.println("Объем: " + threeDShape.getVolume());
            }
        }
    }
}