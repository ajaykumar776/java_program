import java .util.Scanner;
class Building{
	int len,bre,count;
	String str;
	Building(String str){//constructor as a parameter;
		this.str=str;
		//System.out.println("building name = "+str);
	}
	int building_details(int len,int bre){//methos overloading;
		int area=len*bre;
		return area;
	}
	int building_details(int count){//method overloading
		return count ;
	}
}
class Main{
	public static void main(String args[]){

        Scanner sc= new Scanner(System.in);//
		String str="ajay";
		int len,bre,count;
		System.out.println("enter the building name:");/////take data from the keyboard
		str=sc.nextLine();
		//System.out.println("building name = "+str);
		Building b = new Building(str);
		System.out.println("enter the lenth and breath of the building :");
		len=sc.nextInt();
		bre=sc.nextInt();
		int p=b.building_details(len,bre);
		System.out.println("enter the family size:");
		count=sc.nextInt();
	//	System.out.println("area of the building  : "+p);
		int q=b.building_details(count);
		System.out.println("building name = "+str);
		System.out.println("area of the building  : "+p);
		System.out.println("total family size  :  : "+q );

	}
}