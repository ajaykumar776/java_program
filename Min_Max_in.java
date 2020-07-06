class Max
{
	int arr[]={1,3,4,5,6,7};
	int i;
	int max=arr[0];
	int min=arr[0];
	void max_min_element()
	{
		for(i=1;i<arr.length;i++)
		{
			if(max<arr[i])

				max=arr[i];

			if(min>arr[i])

			min=arr[i];
		System.out.println(+a[i]);
		}
		System.out.println(max);
		System.out.println(min);

	}	
}
class Main
{
	public static void main(String args[])
	{
		int p;
		Max num=new Max();
		num.max_min_element();
		//System.out.println(p); 

	}
}