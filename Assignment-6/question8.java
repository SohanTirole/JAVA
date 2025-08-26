//8. WAP to insert a element in array at specific position.
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please let us know the length of Array..");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("\nEnter the Elements of Array..");
        for(int i=0 ; i<n ; i++)
        {
            System.out.println("Enter the "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        //Array Printing Before Inserting new element
        System.out.println("Before Inserting any Element in Array");
        for(int i=0 ; i<n ; i++)
        {
            System.out.println(arr[i]);   
        }
        System.out.println("\nEnter the Positino");
        int position = sc.nextInt();
        System.out.println("Enter the New Element");
        int NewElement = sc.nextInt();
        //inserting a element in array at specific position.
        for(int i=position-1 ; i<n+1 ; i++)
        {
            int OldElement = arr[i];
            arr[i] = NewElement;
            NewElement = OldElement;
        }
        System.out.println();
        //Array Printing Before Inserting new element
        System.out.println("After Insertin a New Element in Array");
        for(int i=0 ; i<n+1 ; i++)
        {
            System.out.println(arr[i]);   
        }


        
    }
}
