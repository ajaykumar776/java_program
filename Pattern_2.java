class Pattern_2
{
	void p(int n)
	{
		int i,j;
		/*for(i=1;i<n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}*/

		for(i=1;i<n;i++)
		{
			for(j=n-1;j>=i;j--)
			{			
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
	public static void main(String args [])
	{
		Pattern_2 name=new Pattern_2();
		name.p(7); 
	}
}