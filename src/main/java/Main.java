import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, column;
        System.out.println("Welcome to Minesweeper");
        System.out.println("Type your board size");
        System.out.println("Enter row size");
        row = scanner.nextInt();
        System.out.println("Enter column size");
        column = scanner.nextInt();
        Minesweeper minesweeper = new Minesweeper(row, column);
        minesweeper.run();
    }
}
