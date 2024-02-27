public class HollowSquarePattern 
{

    static void printHollowSquare(int side) 
    {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) 
            {
                if (i == 0 || i == side - 1 || j == 0 || j == side - 1) 
                {
                    System.out.print("*\t");
                } 
                else 
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {

        int sideLength = 5;
        printHollowSquare(sideLength);
    }
}