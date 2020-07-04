import java.util.Scanner;
class Fun{
	int a[]=new int [100];
	int i,j,temp,n;
	Scanner s=new Scanner(System.in);//this is for scanning the value from the user 
	Fun(int x)
	{
		n=x;
	}
	void getdata(){
		System.out.println("enter the arry element");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();//this statement use for taking value from user
		}
	}
	void accending_order(){
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(a[i]>a[j])//accending order sorting logic
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			    }
			}
		}

		System.out.println("your array in accending order  ");
		for(i=0;i<n;i++){
			System.out.println(+a[i]);
		}
	}
		void decending_order(){
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(a[i]<a[j])//decending order sorting logic
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			    }
			}
		}
		System.out.println("your array element in decending order ");
		for(i=0;i<n;i++){
			System.out.println(+a[i]);
		}
		
	}
	
}
class Main
{
	public static void main(String args[]){
		Fun num =new Fun(5);
		num.getdata();
		num.accending_order();
		num.decending_order();
	}
}



