/* mySudoku
 * Aki Sipovaara 2018
 */

// Contains sudoku and ways to use it
public class mySudoku {
    // Private variables

    public mySudoku() {
        this.data = new sudokuData();
        this.data.initializeData();
        this.data.generateSudoku();
    }

    public mySudoku(sudokuData newData) {
        this.data = newData;
    }

    public String print() {
        String result = this.data.toString();

        return result;
    }

    private sudokuData data;
}