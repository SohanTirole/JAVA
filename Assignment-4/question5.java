/*
Q6. 2 4 6 8 ........n-Terms
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Please let us know the sequence of seriese..");
        n = sc.nextInt();
        System.out.println();
        
        for(i=1; i<=n ; i++)
        {
            if(i%2==0)
                System.out.println(i);
            else
                n = n+1;    
        }
        
    }

}