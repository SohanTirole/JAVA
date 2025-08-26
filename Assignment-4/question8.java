/*
Q8. 1	2	2	4	8	32	…… n terms
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
         
        Scanner sc = new Scanner(System.in);
        long a, b, c, n;
        System.out.println("Please let us know the range of the seriese..");
        n = sc.nextInt();
        System.out.println();
        a=1;
        b=2;
        for(int i = 0; i<=n-1 ; i++)
        {
            if(i==0)
            {
                System.out.println(a);
                System.out.println();
                System.out.println(b);
            }
            
            c = a*b;
            System.out.println();
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}