/*
Q9. 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        float sum=0, i, j;
        System.out.println("Please let us know the range of sequence..");
        n = sc.nextInt();
        for(j=1,i=1; i<=n ; i++)
        {   
            sum = sum + (j/i);
        }
        System.out.println("Sum of the Sequence from 1 to "+n+" : "+sum);
    }
}