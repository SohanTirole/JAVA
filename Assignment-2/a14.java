/*
14. The length of one of the diagonals of a field in the form of a quadrilateral is 46 m. The perpendicular distance of the other two vertices from the diagonal are 13 m and 10 m, find the area of the field.
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float D, V1, V2, Area;
		System.out.println("Enter the Diagonals of a quardrilateral : ");
		D = sc.nextFloat();

		System.out.println("Enter the Vertices from the Diagonal : ");
		V1 = sc.nextFloat();
		V2 = sc.nextFloat();
		
		float Areat1,Areat2;

		Areat1 = (D*V1)/2;
		Areat2 = (D*V2)/2;

		Area = Areat1+Areat2;
		System.out.println("Area of the field : "+Area+" m^2");
	}
}