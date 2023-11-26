public class CommandLineArray {

    public static void main(String[] args) {
        int arraySize = args.length > 0 ? Integer.parseInt(args[0]) : 10;
        int[] array = new int[arraySize];

        // Инициализация массива
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        // Вывести массив
        System.out.println("Элементы массива:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Элемент с индексом " + i + ": " + array[i]);
        }
    }
}
