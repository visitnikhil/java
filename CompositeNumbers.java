public class CompositeNumbers 
{
    public static void main(String[] args) 
    {
        int limit = 10;
        System.out.println("Composite numbers up to " + limit + ":");
        for (int i = 4; i <= limit; i++) 
        {
            if (isComposite(i)) 
            {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isComposite(int n) 
    {
        if (n <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) 
            {
                return true;
            }
        }
        return false;
    }
}
