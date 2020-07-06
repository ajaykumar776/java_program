class Main{
	int length;
	int breath;
	void getdata(int a,int b)
	{
		length=a;
		breath=b;
	}

}
class Area
{
	public static void main(String args [])
	{
		int c;
		Main num=new Main();
		num.getdata(10,10);
	    c=num.length*num.breath;
		System.out.println("area is "+c);
	}
} longint 