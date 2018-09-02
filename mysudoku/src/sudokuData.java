/* mySudoku
 * Aki Sipovaara 2018
 */

import java.util.ArrayList;

public class sudokuData {
    public sudokuData() {
        data = new ArrayList<>();
        row1 = new ArrayList<>();
        row2 = new ArrayList<>();
        row3 = new ArrayList<>();
        row4 = new ArrayList<>();
        row5 = new ArrayList<>();
        row6 = new ArrayList<>();
        row7 = new ArrayList<>();
        row8 = new ArrayList<>();
        row9 = new ArrayList<>();

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

        for (ArrayList<Integer> row : this.data) {
            for (int element : row) {
                result += element + " ";
            }
            result += "\n";
        }

        return result;
    }

    private ArrayList<ArrayList<Integer>> data;
    private ArrayList<Integer> row1;
    private ArrayList<Integer> row2;
    private ArrayList<Integer> row3;
    private ArrayList<Integer> row4;
    private ArrayList<Integer> row5;
    private ArrayList<Integer> row6;
    private ArrayList<Integer> row7;
    private ArrayList<Integer> row8;
    private ArrayList<Integer> row9;
}
