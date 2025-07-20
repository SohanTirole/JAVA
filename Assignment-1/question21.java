/*
21. A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres?
*/
class Test
{
	public static void main(String args[])
	{
		float VBrick, VWall;
		//Volume = length × width × height
		
		//beacause : 1 m = 100 cm
		 VWall = (15*100)*(10*100)*(8*100);
		
		VBrick = 15*8*5;
		float TotalBrick = VWall/VBrick;

		System.out.println("Totla "+TotalBrick+" Brick will used to make a Wall");
		
	}
}