/*
Q5. 1 3 5 7 9 .....n-Terms
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please let us range of sequence..");
        int i,term;
        term = sc.nextInt();
        term = term;
        System.out.println();
        for(i = 1 ; i<=term ; i++)
        {
            if(i%2!=0)
                System.out.println(i);
            else
                term=term+1;
        }
    }
}