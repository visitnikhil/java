public class InvertedFullPyramid 
{
    static void printInvertedFullPyramid(int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print("\t");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) 
            {
                System.out.print(".\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int numberOfRows = 5;
        printInvertedFullPyramid(numberOfRows);
    }
}