import java.util.Scanner;

public class SudokuScanner {

    private Scanner scanner = new Scanner(System.in);
    private int row;
    private int column;
    private int num;

    public void scanNumbers(Scanner scanner) {
        row = scanner.nextInt();
        column = scanner.nextInt();
        num = scanner.nextInt();
    }
}
