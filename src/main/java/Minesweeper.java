import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    int rowNumber, colNumber;
    int[][] map;
    int[][] board;

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    Minesweeper(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];

    }
}
