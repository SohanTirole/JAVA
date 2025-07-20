/*
43. Find the cost of polishing the base of a cone whose height is 4cm and slant height 5 cm at the rate of 10 rs. Per sq. cm
*/
class Test 
{
	public static void main(String args[])
	{
		float r, l, h, Cost, Area;
		h=4.0f;
		l=5.0f;
		
		//Pythagoras Theorem l^2=r^2+h^2⇒r^2=l^2−h^2
		r = (float)((l*l)-(h*h));
		System.out.println(r);
		r = (float)(Math.sqrt(r));
		System.out.println(r);
		
		//Area of base=πr^2	
		Area =(float)((3.1416)*r*r);
		Cost = (float)(Area*10);
		System.out.println("Cost of Polishing : "+Cost+" rs");
		
	}
}