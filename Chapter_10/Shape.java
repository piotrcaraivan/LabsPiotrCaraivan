// Абстрактный базовый класс Shape
abstract class Shape {
    public abstract String getName();
}

// Абстрактный класс двумерных фигур
abstract class TwoDimensionalShape extends Shape {
    public abstract double getArea();
}

// Абстрактный класс трехмерных фигур
abstract class ThreeDimensionalShape extends Shape {
    public abstract double getArea();
    public abstract double getVolume();
}

// Конкретные классы для различных форм
class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}

class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public String getName() {
        return "Сфера";
    }
}
