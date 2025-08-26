//WAP to delete element from array at specific position.
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Array");
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];
        System.out.println();

        System.out.println("Enter the Array Elements..");
        for(i=0 ; i<n ; i++)
        {
            System.out.println("Enter the "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Array Befor Deleting any element");
        for( i=0 ; i<n ; i++)
        {
            System.out.println(arr[i]);   
        }
        System.out.println("Enter the Postion whose element you want to delet");
        int position = sc.nextInt();
        if((position-1) <= n+1)
        {
            for(i=position-1 ; i<=n ; i++)
            {
                if(i<n-1)
                    arr[i] = arr[i+1];
                else if(i==n-1)
                    arr[i]=0;
            }
            System.out.println("Array After Deleting a element");
            for(i=0 ; i<n ; i++)
            {
                System.out.println(arr[i]);   
            }
        }
        else 
            System.out.println("Postion is out of range");
    }
}