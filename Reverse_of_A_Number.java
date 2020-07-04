class Reverse_Of_A_Number
{
	int n;
	int sum=0;
	int rem;
	int reverese(int n)
	{
		while(n!=0)
		{
			rem=n%10;
		    sum=sum*10+rem;
		    n=n/10;
		}
		return sum;
		
	}
}
class Main
{
	public static void main(String args[])
	{
		int p;
		Reverse_Of_A_Number rev=new Reverse_Of_A_Number();
		p=rev.reverese(123456789S);
		System.out.println(p);
	}
}