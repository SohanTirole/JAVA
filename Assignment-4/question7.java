
/*
Q7. 0 1 1 2 3 5 8 13 ..... n-Terms 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please let us know the range of series..");
        int n = sc.nextInt();
        int a=0, b=1;
        System.out.println();
         
        System.out.println();
        for(int i=0 ; i<n-2; i++)
        {
            if(i==0)
            {
                System.out.println(0);
                System.out.println(1);
            }
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

}