import java.util.Random;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        int d = 1;
        do {
            game();
            System.out.println();
            d = answer();
        } while (d == 1);
        System.out.println("Thanks for amazing game! Good bye!");
    }

    static int answer() {
        Scanner answer = new Scanner(System.in);
        do {
            System.out.println("Do you want to play once again? (1 - Yes / 2 - No)");
            if (answer.hasNextInt()) {
                return answer.nextInt();
            }
            answer.nextLine();
        }
        while (true);
    }

    static int readFromConsole() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input integer number from 0 to 9!");
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            sc.nextLine();
        }
        while (true);
    }

    /* static int boundInputFromConsole() {
        Scanner bound = new Scanner(System.in);
        int z = bound.nextInt();
            do {
                if (z < 0) {
                    System.out.println("You put wrong number. Input integer number from 0 to 9!");
                } else if (z > 9) {
                    System.out.println("You put wrong number. Input integer number from 0 to 9!");
                } else
                    return bound.nextInt();
            }
            while (true);
    } */

    static int randProcedure() {
        Random rand = new Random();
        int randomized = rand.nextInt(10);
        System.out.println(randomized);
        return randomized;
    }

    static void game() {
        int y = randProcedure();
        for (int z = 0; z < 3; z++) {
            int a = readFromConsole();
            if (a < 0) {
                System.out.println("You put wrong number. Input integer number from 0 to 9!");
            }
            else if (a > 9) {
                System.out.println("You put wrong number. Input integer number from 0 to 9!");
            }
            else if (y == a) {
                System.out.println("Congratulations! You are right!");
                break;
            }
            else if (a > y) {
                System.out.print("Input number isn't correct. Set number is less. You have " + (2 - z) + " more attempts. ");
            }
            else
                System.out.print("Input number isn't correct. Set number is bigger. You have " + (2-z) + " more attempts. ");
        }
    }
}


