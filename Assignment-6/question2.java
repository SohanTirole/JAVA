//2. WAP to program to calculate the sum of all element of array.
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please let us know the Size of Array..");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i,sum = 0;
        System.out.println();
        for(i=0 ; i<n ; i++)
        {
            System.out.println("Please enter the "+(i+1)+" element..");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum of Array Element : "+sum);
    }
}