import java.util.Scanner;
class Main 
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name : ");
		String name=s.next();
		//System.out.println("your name is "+name);
		System.out.println("enter the age : ");
		int age=s.nextInt();
		System.out.println("your name is "+name);
		System.out.println("your age is = "+age);

	}
} 