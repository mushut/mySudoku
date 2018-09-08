/* mySudoku
 * Aki Sipovaara 2018
 */

import java.util.ArrayList;

public class sudokuData {
    public sudokuData() {
        data = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        ArrayList<Integer> row2 = new ArrayList<>();
        ArrayList<Integer> row3 = new ArrayList<>();
        ArrayList<Integer> row4 = new ArrayList<>();
        ArrayList<Integer> row5 = new ArrayList<>();
        ArrayList<Integer> row6 = new ArrayList<>();
        ArrayList<Integer> row7 = new ArrayList<>();
        ArrayList<Integer> row8 = new ArrayList<>();
        ArrayList<Integer> row9 = new ArrayList<>();

        data.add(row1);
        data.add(row2);
        data.add(row3);
        data.add(row4);
        data.add(row5);
        data.add(row6);
        data.add(row7);
        data.add(row8);
        data.add(row9);
    }

    public sudokuData(ArrayList<ArrayList<Integer>> newData) {
        this.data = newData;
    }

    // TBD
    public int initializeData() {
        int result = 0;

        return result;
    }

    // TBD
    public int generateSudoku() {
        int result = 0;

        return result;
    }

    @Override
    public String toString() {
        String result = "";
        int rowIndex = 0;

        for (ArrayList<Integer> row : this.data) {
            for (int element : row) {
                result += element + " ";
            }
            if (rowIndex < 8) {
                result += "\n";
            }
            rowIndex++;
        }

        return result;
    }

    public String toCSV() {
        String result = "";
        int rowIndex = 0;
        int elementIndex = 0;

        for (ArrayList<Integer> row : this.data) {
            for (int element : row) {
                if (elementIndex < 8) {
                    result += element + ",";
                    elementIndex++;
                }
                else {
                    result += element;
                    elementIndex = 0;
                }
            }

            if (rowIndex < 8) {
                result += "\n";
            }

            rowIndex++;
        }

        return result;
    }

    private ArrayList<ArrayList<Integer>> data;
}
