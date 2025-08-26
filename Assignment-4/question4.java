/*
Q4. Calculate the sum of following series
    1 2 3 .....n  
    1 - 2 + 3 - 4 + 5 - 6 ....n 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Please let us know the range of the series..");
        n = sc.nextInt();

        for(i=1; i<=n ; i++)
        {
            sum = sum+i;
        }
        System.out.println(" 1 2 3 .....n  ");
        System.out.println("Sum of Sequence from 1 to "+n+" th term : "+sum);
        System.out.println();   
        sum = 0;
        for(i=1; i<=n ; i++)
        {
            if(i%2==0)
                sum = sum - i;
            else
                sum = sum + i;
        }
        System.out.println("1 - 2 + 3 - 4 + 5 - 6 ....n ");
        System.out.println("Sum of Sequence from 1 to "+n+" th term : "+sum);
    }
}