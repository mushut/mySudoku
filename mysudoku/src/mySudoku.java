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

        this.id = "No id";
    }

    public mySudoku(String newId, sudokuData newData) {
        this.id = newId;
        this.data = newData;
    }

    public String print() {
        String result = this.id + ":\n" + this.data.toString();

        return result;
    }

    private sudokuData data;
    private String id;
}