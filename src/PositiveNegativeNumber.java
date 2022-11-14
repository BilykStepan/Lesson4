import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of attempts:");
        int attempt = input.nextInt();
        for (int i = 0; i < attempt; i++) {
            System.out.println("Select a number from array from -2147483648 to 2147483648:");
            int number = input.nextInt();
            if (number < 0) {
                System.out.println("Negative");
            } else if (number == 0) {
                System.out.println("Zero");
            } else {
                System.out.println("Positive");
            }
        }

    }
}
