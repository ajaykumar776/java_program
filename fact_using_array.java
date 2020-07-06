import java.util.Scanner;
class Fun{
	int f[]=new int [100];
	int i;
	void fact(int n)
	{
		f[0]=1;
		for(i=1;i<=n;i++){
			f[i]=i*f[i-1];
		}
		for(i=0;i<n;i++){
			System.out.println(+f[i]);
		}
	}
}
class Main
{
	public static void main(String args[]){
		Fun factorial=new Fun();
		factorial.fact(10);
	}
}