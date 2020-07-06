import java.util.Scanner;
class Room
{
	int length ,breath;
	Room(int x,int y )
	{
		this.length=x;
		this.breath=y;
	}
	int area()
	{
		return length*breath;
	}

}
class Bedroom extends Room
{
	int height ;
	 Bedroom(int x,int y,int z)
	{
		super(x,y);
		height=z;
		
	}
	int volume()
	{
		return (length*breath*height);
	}
}
class Main
{
	public static void main(String args[])
	{
		Bedroom b=new Bedroom(10,5,6);
		int area1=b.area();
		int area2=b.volume();
		System.out.println(+area1);
		System.out.println(+area2);

	}
}