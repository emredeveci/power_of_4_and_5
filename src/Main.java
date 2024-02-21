import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //variable initialization
        int userInput;

        //scanner initialization and user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number limit: ");
        userInput = scanner.nextInt();

        //loops to print the intended result
        for (int i = 1; i <= userInput; i *= 4) {
            System.out.println(i);
        }

        System.out.println("End of numbers that are the powers of 4.");

        for (int x = 1; x <=userInput; x *= 5) {
            System.out.println(x);
        }

        System.out.println("End of numbers that are the powers of 5.");

        scanner.close();
    }
}