import java.util.Random;
import java.util.Scanner;

public class HW4 {
    public static  char [][] map;
    static final int SIZE = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public  static  void main(String[] args) {
        initmap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            System.out.println("Human is win!");
            break;
        } if (isMapFull()) {
            System.out.println("Tie game");
        }
        aiTurn();
        printMap();

        System.out.println("Game is finished");

    }

    static  void initmap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    static  void humanTurn() {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        do {
           System.out.println("Input numbers at format X Y");
           x = sc.nextInt() - 1;
           y = sc.nextInt() - 1;
        }
        while (!isCellValid(x, y));
        map [x][y] = DOT_X;
    }
    static  void aiTurn() {
        Random sc = new Random();
        int x;
        int y;
        do {
            x = sc.nextInt(SIZE);
            y = sc.nextInt(SIZE);
        }
        while (!isCellValid(x, y));
        System.out.println("AI choose dot " + (x + 1) + " " + (y + 1));
        map [x][y] = DOT_O;
    }
    static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }
    static  boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
