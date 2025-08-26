//10)WAP to to count the occurance of all element in array
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //Asking for Array length
        System.out.println("Enter the Length of Array");
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];
        System.out.println();

        //Asking for Array Element's
        System.out.println("Enter the Array Elements..");
        for(i=0 ; i<n ; i++)
        {
            System.out.println("Enter the "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }

        //Checking the Oc
        System.out.println();
        int count,flag;
        flag = 0;
        for(i=0 ; i<n ; i++)
        {
            count = 0;
            for(int j=0; j<n ; j++)
            {
                if(arr[i]==arr[j])
                    count++;
                    flag++;
            }
            if(flag==1)
                System.out.println("Occurance Count of "+arr[i]+" is : "+count);
            else if(flag>1)
            {
                
            }
        }
    }
}