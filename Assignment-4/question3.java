/*
Q3. 1 4 9 16 25 ...n [Term]
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Please let us know the n th term..");
        n = sc.nextInt();
        for(i=1 ; i<=n ; i++)
        {
            System.out.println(i*i);
        }
    }
}