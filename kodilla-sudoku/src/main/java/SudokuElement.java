import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SudokuElement {

    private int value;
    public static int EMPTY = -1;
    private List<Integer> availableValues = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public int sudokuElementField() {

        if (value == EMPTY) {
            value = availableValues.get(scanner.nextInt());
        } else {
            availableValues.iterator().next();
        }
        return value;
    }
}
