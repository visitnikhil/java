import java.util.Scanner;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the number of rows for the right triangle: ");
        int numRows = scanner.nextInt();

        System.out.println("Right triangle star pattern:");
        printRightTriangle(numRows);

        scanner.close();
    }

    public static void printRightTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            
            for (int j = 1; j <= numRows ; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
