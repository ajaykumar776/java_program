class Number
{
	int n;
	int flag=1,i;

	int check(int n)
	{
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=0;
			}
		}
		return flag;
	}
}
class Main
{
	public static void main(String args[])
	{
		int p;
		Number prime=new Number();
		p=prime.check(9);
		if(p==0)
		{
			System.out.println("not prime number");
		}else
		{
			System.out.println(" prime number");
		}
		
	}
}