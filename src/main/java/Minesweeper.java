import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    int rowNumber, colNumber, size;
    int[][] map;
    int[][] board;
    boolean game = true;

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private int column;

    Minesweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run() {
        int row, column, success = 0;
        prepareGame();
        print(map);
        System.out.println("Game started!");
        while (game) {
            print(board);
            System.out.print("Row : ");
            row = scanner.nextInt();
            System.out.print("Column : ");
            column = scanner.nextInt();

            if (row <= 0 || row >= rowNumber) {
                System.out.println("Wrong coordinate");
                continue;
            }

            if (column <= 0 || column >= colNumber) {
                System.out.println("Wrong coordinate");
                continue;
            }

            if (map[row][column] != -1) {
                checkMine(row, column);
                success++;
                if (success == (size - (size / 4))) {
                    System.out.println("Congratulations!");
                    break;
                }
            } else {
                game = false;
                System.out.println("Game over!");
            }
        }
    }

    public void checkMine(int row, int column) {
        if (map[row][column] == 0) {
            if ((column < colNumber - 1) && (map[row][column + 1] == -1)) {
                board[row][column]++;
            }
            if ((row < rowNumber - 3) && (map[row + 1][column] == -1)) {
                board[row][column]++;
            }
            if ((row > 0) && (map[row - 1][column] == -1)) {
                board[row][column]++;
            }
            if ((column > 0) && (map[row][column - 1] == -1)) {
                board[row][column]++;
            }
            if (board[row][column] == 0) {
                board[row][column] = -2;
            }
        }
    }

    public void prepareGame() {
        int randomRow, randomColumn, count = 0;
        while (count != (size / 4)) {
            randomRow = random.nextInt(rowNumber);
            randomColumn = random.nextInt(colNumber);
            if (map[randomRow][randomColumn] != -1) {
                map[randomRow][randomColumn] = -1;
                count++;
            }
        }
    }

    public void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] >= 0)
                    System.out.print(" ");
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
