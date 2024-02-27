public class PascalTriangle 
{

    static void printPascalTriangle(int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                System.out.print("\t");
            }
            int value = 1;
            for (int j = 0; j <= i; j++) 
            {
                System.out.print(value + "\t\t");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int numberOfRows = 5;

        printPascalTriangle(numberOfRows);
    }
}