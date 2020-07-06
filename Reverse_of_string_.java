class Operation
{
	String name ="ajay";
	int n =name.length();
	String rev ="";
	String  perform()
	{
		int i;
		for(i=n-1;i>=0;i--)
		{
			rev=rev +name.charAt(i);
		}
		return rev;
		
	}
}
class Reverse
{
	public static void main(String args[])
	{
		String length;
		Operation count1=new Operation();
		length=count1.perform();
		System.out.println(length);
	}
}