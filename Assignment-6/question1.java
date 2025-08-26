//1. WAP to Enter n element in array and print array
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array..");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Element of Array..");
        for(int i=0 ; i<n ; i++)
        {
            System.out.println("Enter the "+(i+1)+" element of Array..");
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Given Array elements are..");
        for(int i=0 ; i<n ; i++)
        {
            System.out.println(arr[i]);
        }

    }
}