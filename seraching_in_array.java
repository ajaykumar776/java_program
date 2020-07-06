import java.util.Scanner;
class Searching{
	Scanner s=new Scanner(System.in);
	int a[]=new int[100];
	int i,item, n;
	Searching(int x){
		n=x;
	}
	void getdata(){
		System.out.println("enter the arry element");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();//this statement use for taking value from user
		}
	}
	void search(int item){
		for(i=0;i<n;i++){
			if(a[i]==item){
				System.out.println("element is present at idex  " +i);
			}
		}
	}
}
class Main{
	public static void main(String args []){
		Searching num =new Searching(5);
		num.getdata();
		num.search(1);
	}
}