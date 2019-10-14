package zadanieStart;

public class Board {

    private final static int rowOffset = 2;
    private final static int colOffset = 2;
    private char[][] boardCounter;

    public Board(int rowCout, int colCout) {
        this.boardCounter = new char[rowCout + rowOffset][];
        for (int i = 0; i < rowCout + rowOffset; i++) {
            this.boardCounter[i] = new char[colCout + colOffset];
        }


        /*cyferki*/
        /*----------------------------------------------*/
        for (int i = 0; i < boardCounter.length - 2; i++) {
            this.boardCounter[boardCounter.length - 1][i + 2] = String.valueOf(i).charAt(0);
        }

        for (int i = boardCounter.length - 3; i >= 0; i--) {
            this.boardCounter[i][0] = String.valueOf(rowCout - i - 1).charAt(0);
        }
        /*------------------------------------------*/


        /*linijki*/
        /*------------------------------------------*/
        for (int i = 0; i < boardCounter.length - 2; i++) {
            this.boardCounter[boardCounter.length - 2][i + 2] = '-';
        }

        for (int i = boardCounter.length - 3; i >= 0; i--) {
            this.boardCounter[i][1] = '|';
        }
        /*--------------------------------------------------*/
    }


    public String toSting() {
        String res = "";

        for (int i = 0; i < boardCounter.length; i++) {
            for (int j = 0; j < boardCounter[i].length; j++) {
                res += boardCounter[i][j];
            }
            res += "\n";
        }
        return res;
    }

    public char getCell(int rowIdx, int colIdx) {
        return boardCounter[rowIdx][colIdx];
    }

    public void insertPoint(int x, int y) {
        boardCounter[boardCounter.length - y -3][x+2]='x';
    }
}

