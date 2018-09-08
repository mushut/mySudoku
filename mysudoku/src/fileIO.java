/* mySudoku
 * Aki Sipovaara 2018
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileIO {
    public fileIO() {
    }

    public void save(String saveFile, mySudoku savedSudoku) {
        // Saving
        File outputFile;

        if (saveFile != null) {
            outputFile = new File(saveFile);
            try {
                FileWriter writerCsv = new FileWriter(outputFile);

                writerCsv.append(createCSV(savedSudoku));

                writerCsv.close();
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    public mySudoku load(String loadFile) {
        // Loading
        String id;
        sudokuData loadedData;

        if (loadFile != null) {
            File inputFile = new File(loadFile);
            try {
                Scanner readCsv = new Scanner(inputFile);
                readCsv.useDelimiter(",|\\r\\n");
                id = readCsv.next();
                ArrayList<ArrayList<Integer>> data = new ArrayList<>();

                for (int i = 0; i < 9; ++i) {
                    ArrayList<Integer> row = new ArrayList<>();
                    for (int j = 0; j < 9; ++j) {
                        row.add(readCsv.nextInt());
                    }

                    data.add(row);
                }

                loadedData = new sudokuData(data);

                mySudoku loadedSudoku = new mySudoku(id, loadedData);

                readCsv.close();

                return loadedSudoku;
            }
            catch(FileNotFoundException e) {
                System.out.println(e);
            }
        }

        return null;
    }

    private String createCSV(mySudoku sudoku) {
        return sudoku.dataToCSV();
    }
}
