import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    private List<SudokuRow> boardList = new ArrayList<>();

    public int[][] generateBoard(int[][] board){
        SudokuRow x = new SudokuRow();

        boardList.add(x);
        return board;
    }
}
