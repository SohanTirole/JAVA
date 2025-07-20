/*
14. The length of one of the diagonals of a field in the form of a quadrilateral is 46 m. The perpendicular distance of the other two vertices from the diagonal are 13 m and 10 m, find the area of the field.
*/
class Test 
{
	public static void main(String args[])
	{
		float Area1, Area2, Base, H1, H2;
		Base = 46;
		H1=13;
		H2=10;
			
		//Finding the area of the quadrilateral by spliting th quadrilateral into two trianlge 
		//Arae of traingle = 1/2 * base * height
		
		Area1 = (Base*H1)/2;
		Area2 = (Base*H2)/2;

		float AOQ  = Area1+Area2;

		System.out.println("Area of Quadrilateral is : "+AOQ+" m^2");

	}
}