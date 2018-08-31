/* mySudoku
 * Aki Sipovaara 2018
 */

import java.util.Scanner;

// Console UI for using the application
public class consoleUI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuChoice = 0;
        mySudoku sudoku;

        System.out.println("mySudoku");
        while (true) {
            System.out.println("Menu");
            System.out.println("1: Create a sudoku");
            System.out.println("2: Print the sudoku");
            System.out.println("3: Save the sudoku in a file");
            System.out.println("4: Load the sudoku from a file");
            System.out.println("5: Quit");
            menuChoice = input.nextInt();

            switch(menuChoice) {
                case 1:
                    // Create a sudoku
                    sudoku = new mySudoku();
                    break;
                case 2:
                    // Print the sudoku if there is one created
                    sudoku.print();
                    break;
                case 3:
                    // Save the sudoku in a file if there is one created
                    sudoku.saveToFile();
                    break;
                case 4:
                    // Load the sudoku from a file
                    sudoku = loadSudokuFromFile();
                    break;
                case 5:
                    // Quit
                    break;
                default:
                    // Is this needed?
            }

            if (menuChoice == 5) {
                break;
            }
        }
    }
}