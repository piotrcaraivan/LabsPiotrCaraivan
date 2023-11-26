import java.util.Scanner;

public class SquareDisplay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите длину стороны квадрата: ");
        int side = input.nextInt();

        System.out.print("Введите символ для заполнения квадрата: ");
        char fill = input.next().charAt(0);

        displaySquare(side, fill);

        input.close();
    }

    public static void displaySquare(int side, char fillCharacter) {
        for (int row = 0; row < side; row++) {
            for (int col = 0; col < side; col++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}
