public class TablePrinter {
    public static void main(String[] args) {
        // Вывести заголовок таблицы
        System.out.println("N\t10*N\t|\t100*N\t1000*N");
        System.out.println("----------------------------------------");

        // Цикл для первой части таблицы
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d\t%d\t|\t", i, 10 * i);
            
            // Цикл для второй части таблицы в той же строке
            System.out.printf("%d\t%d%n", 100 * i, 1000 * i);
        }
    }
}
