public class Rectangle {
    private float length = 1;
    private float width = 1;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length > 0.0f && length < 20.0f) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Длина должна быть больше 0,0 и меньше 20,0");
        }
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width > 0.0f && width < 20.0f) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Ширина должна быть больше 0,0 и меньше 20,0");
        }
    }

    public float calculateArea() {
        return length * width;
    }

    public float calculatePerimeter() {
        return 2 * (length + width);
    }
}
