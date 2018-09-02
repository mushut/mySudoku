/* mySudoku
 * Aki Sipovaara 2018
 */

import java.io.File;

public class fileIO {
    public fileIO() {

    }

    public void save(String saveFile) {
        // Saving
    }

    public mySudoku load(String loadFile) {
        // Loading
        sudokuData loadedData = new sudokuData();

        if (loadFile != null) {
            File inputFile = new File(loadFile);
        }

        mySudoku loadedSudoku = new mySudoku(loadedData);

        return loadedSudoku;
    }
}
