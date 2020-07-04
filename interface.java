import java.util.Scanner;
interface Aera
{
	 final static float  pi = 3.14F ;
	float  compute(int x,int y);

}
class Rectangle implements Aera
{
	public float compute(int x,int y)
	{
		return x*y;
	}
}
class Circle implements Aera
{
	public float  compute(int x,int y)
	{
		return (pi*x*x);
	}
}
class Main
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		float  a=r.compute(10,5);
		Circle c=new Circle();
		float  f=c.compute(11,6);
		System.out.println("Aera of recatngle is : "+a+"\nAera of circle is :"+f+"");

	}//System.out.println("name : "+this.name+" | type : "+this.type+" | balance : "+this.balance);
}
