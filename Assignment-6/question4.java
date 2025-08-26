//4. WAP to find an element in array.
import java.util.Scanner;
class Test 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please let us know the size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            System.out.println("Please enter the "+(i+1)+" element of Array..");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter the Element which you want to find in the given arry..");
        int Element = sc.nextInt();
    
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]==Element)
            {
                System.out.println("Given Element is Exist at Serial No : "+(i+1));
            }
            else if(arr[i]!=Element && i>n)
            {
                System.out.println("Given Element is Not Exist in this Array");
            }
        }

    }
}