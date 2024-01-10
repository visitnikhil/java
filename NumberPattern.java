import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to be printed: ");
        int number = scanner.nextInt();

        System.out.print("Max Number of time printed: ");
        int maxTimes = scanner.nextInt();

        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
