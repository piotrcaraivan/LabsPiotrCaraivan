public class SquaresAndCubes {
    public static void main(String[] args) {
        System.out.println("Номер\tКвадрат\tКуб");

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d\t%d\t%d\n", i, i * i, i * i * i);
        }
    }
}
