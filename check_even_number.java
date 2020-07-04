class Check_even_number
{
	public static void main(String args [])
	{
		Check_even_number name=new Check_even_number();
		name.p(10); 
	}
	void p(int n)
	{
		int i,j,k;

		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(+i);
			}
			
		}
		

	}
}