class greater_Number{
	int c;
	
	void Check(int a,int b)
	{
		c = a>b?a:b;
		System.out.println("num "+c);
	} 
	public static void main(String args [])
	{
		
		Greater_number num = new Greater_number();
		num.Check(10,9);
		
		
	}
	
}
