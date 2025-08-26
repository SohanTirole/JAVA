
/*
Q.10 0	7	14	21	28	35	…..
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int i,n;
        System.out.println("Please let us know the range of the sequence..");
        n = sc.nextInt();
        System.out.println();
        
        for(i=0 ; i<n ; i++)
        {
            int res = i*7;
            System.out.println(res);
        }
    }
}