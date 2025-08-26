//5. WAP to replace all elements with 0 which is multiples of 5
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please let us know the length of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            System.out.println("Please enter the "+(i+1)+" element..");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n ; i++)
        {
            if(arr[i]%5 == 0)
            {
                arr[i] = 0;
            }
        }
        System.out.println();
        System.out.println("Elements of given Array");
        for(int i=0; i<n ; i++)
        {
            System.out.println(arr[i]);
        }

    }
}