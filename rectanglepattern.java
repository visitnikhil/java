import java.util.Scanner;
public class rectanglepattern 
{
    public static void main(String[] args)
    {
        int a,b,i,j;
        char k;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row: ");
        a = sc.nextInt();
        System.out.println("enter the col: ");
        b = sc.nextInt();
        System.out.println("enter the symbol: ");
        k = sc.next().charAt(0);


        for(i=1;i<=a;i++)
        {
            for(j=1;j<=b;j++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}