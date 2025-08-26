/*
Q2. 1 2 3 ......n [limit]
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
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}