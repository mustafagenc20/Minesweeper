import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    int rowNumber, colNumber, size;
    int[][] map;
    int[][] board;

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    Minesweeper(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run(){

    }

    public void prepareGame(){
        int randomRow, randomColumn, count = 0;
        while(count != (size / 4)){
            randomRow =random.nextInt(rowNumber);
            randomColumn =random.nextInt(colNumber);
            if(map[randomRow][randomColumn] != -1){
                map[randomRow][randomColumn] = -1;
                count++;
            }
        }
    }
}
