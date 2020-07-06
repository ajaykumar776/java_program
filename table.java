 class Table
{
	void p(int n)
	{
		int i=1;
		System.out.println("Table of "+n);
		/*for(i=1;i<=10;i++){
			System.out.println(n+ " * " +i+" = "+(n*i));
		}*/
		/*while(10>=i){
			System.out.println(n+ " * " +i+" = "+(n*i));
			i++;
		}*/
		do
		{
			System.out.println(n+ " * " +i+" = "+(n*i));
			i++;
		}while(i<=10);
		

	}
	public static void main(String args [])
	{
		Table name=new Table();
		name.p(5); 
	}
}/*-+
.021455876577