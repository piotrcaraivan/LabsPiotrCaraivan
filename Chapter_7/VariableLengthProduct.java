public class VariableLengthProduct {

    public static void main(String[] args) {
        System.out.println("Продукт 1, 2, 3: " + product(1, 2, 3));
        System.out.println("Продукт 4, 5: " + product(4, 5));
        System.out.println("Продукт 6, 7, 8, 9: " + product(6, 7, 8, 9));
    }

    public static int product(int... numbers) {
        int totalProduct = 1;
        for (int number : numbers) {
            totalProduct *= number;
        }
        return totalProduct;
    }
}
