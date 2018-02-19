import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SudokuRow {

    private List<SudokuElement> rowList = new ArrayList<>();

    public List<SudokuElement> makingSudokuRow(){

        for(int i=0; i<10; i++){
            if(rowList.listIterator().nextIndex() == SudokuElement.EMPTY) {
                SudokuElement sudokuElement = new SudokuElement();
                sudokuElement.sudokuElementField();
                rowList.add(sudokuElement);
            } else {
                rowList.iterator().hasNext();
            }
        }
        return new ArrayList<>();

    }
}
