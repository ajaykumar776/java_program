class Pattern_3
{
	void p(int n)
	{
		int i,j;
		for(i=1;i<n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

		/*for(i=1;i<n;i++)
		{
			for(j=n-1;j>=i;j--)
			{			
				System.out.printf("*");
			}
			System.out.printf("\n");
		}*/
	}
	public static void main(String args [])
	{
		Pattern_3 name=new Pattern_3();
		name.p(7); 
	}
}