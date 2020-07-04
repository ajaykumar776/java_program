import java.util.Scanner;
class Super
{
	int x;
	Super(int x)
	{
		this.x=x;
	}
	void display()
	{
		System.out.println("number is "+x);
	}
}
class Sub extends Super
{
	int y;
	Sub(int x,int y)
	{
		super(x);
		this.y=y;
	}
	void display()
	{
		System.out.println("number is "+x);
		System.out.println("number is "+y);
	
	}
}
class Main
{
	public static void main(String args[])
	{
		Sub s=new Sub(10,6);
		s.display();
	}
}