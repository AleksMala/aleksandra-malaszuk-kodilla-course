public class SudokuGame {

    public boolean resolveSudoku(){
        return true;
    }

    public static void main (String [] args){

        SudokuScanner sudokuScanner = new SudokuScanner();

        boolean gameFinished = false;
        while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }

    }
}
