import java.util.Scanner;
class Account
{
	String name;
	int accno;
	Account (String name ,int accno )
	{
		this.name= name;
		this.accno =accno;
	}
}
 class Deposit extends Account
{
	int new_balnce;
	int balnce=110;
	int n;
	Scanner s=new Scanner(System.in);
	Deposit(){

		super("ajay",1000);
	}
	void depos(){

		System.out.println("enter the pin  : ");
		int temp=s.nextInt();
		if(accno==temp)
		{
			System .out.println("name : "+name+"");
			System.out.println("enter the amount :");
			this.n=s.nextInt();
		
		    balnce=balnce+n;
		    System.out.println("you have deposited : "+n+"\n|your new balnce is  : "+balnce+"");
		    
	    }else{
	    	System.out.println("==================enter the valid account number :===================");
	    }
	}
	void check(){

		System.out.println("enter the account no  : ");
		int temp=s.nextInt();
		if(accno==temp){
			System .out.println("name : "+name+"");
		    System.out.println("your saving balnce is  : "+balnce+"");
	    }else{
	    	System.out.println("==================enter the valid account number :===================");
	    }
	}
	void withdraw()
	{
		int amount;
		System.out.println("enter the account no  : ");
		int temp=s.nextInt();
		if(accno==temp){
			System .out.println("name : "+name+"");
		    System.out.println("enter the amount ");
		    amount=s.nextInt();
		    if(amount<=this.balnce){
		    	this.balnce=(this.balnce-amount);
		    	System.out.println("please collect the cash");
		    	//System.out.println(+balnce);
		    }
		    else{
		    	System.out.println("there is no balance ");
		    }

	    }else{
	    	System.out.println("==================enter the valid account number :===================");
	    }

	}
}

 class Main{
	 public static void main(String[] args) {
	 	Scanner s=new Scanner(System.in);
	 	Deposit a = new  Deposit();
		System.out.println("1.deposite here ");
		System.out.println("2.check balnce here ");
		System.out.println("3.withdraw from saving");
		int p=s.nextInt();
		switch(p){
			case 1 :
			a.depos();
			break;
			case 2 :
			a.check();
			break;
			case 3 :
			a.withdraw();
			break;
			default : 
			System.out.println("enter valid number  : ");

		}

	}
}