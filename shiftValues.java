import java.util.Scanner;

public class ShiftValues 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the arrays:");
        int size = scanner.nextInt();

        int[] A = new int[size];
        int[] B = new int[size];

        System.out.println("Enter the elements of array A:");
        for (int i = 0; i < size; i++) 
        {
            A[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of array B:");
        for (int i = 0; i < size; i++) 
        {
            B[i] = scanner.nextInt();
        }

        int[] result = new int[size];

        for (int i = 0; i < size; i++) 
        {
            if (A[i] > B[i]) 
            {
                result[i] = A[i] >> 1;
            } 
            else 
            {
                result[i] = A[i] << 1;
            }
        }
        System.out.println("Resulting array after shifting:");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}