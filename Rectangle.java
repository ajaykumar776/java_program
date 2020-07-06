class Rectangle
{
	int len;
	int bre;
	int aera(int len,int bre)
	{
		return len*bre;
	}
	int perimeter(int len,int bre)
	{
		return 2*(len+bre);
	}
}
class Cal
{
	public static void main(String args[])
	{
		int p,q;
		Rectangle total=new Rectangle();
		p=total.aera(5,4);
		q=total.perimeter(5,4);
		System.out.println("aera of rectangle " +p);
		System.out.println("perimeter of recatangle "+q);
	}
}