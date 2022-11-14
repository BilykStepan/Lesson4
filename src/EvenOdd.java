import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of attempts:");
        int attempt = input.nextInt();
        for (int i = 0; i < attempt; i++){
            System.out.println("Enter a number to determine the parity:");
            int number = input.nextInt();
            if (number == 0) {
                System.out.println("Zero");
            } else if (number % 2 == 0) {
                System.out.println(number + " is even number.");
            } else {
                System.out.println(number + " is odd number.");
            }
        }
    }
}
