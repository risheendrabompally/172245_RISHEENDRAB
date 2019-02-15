package com.array;
import com.array.ArrayMain;

public class ArrayMain {
	
	public void details() {
		
		Employee e1=new Employee(531,"Saiteja",20000);
		Employee e2=new Employee(532,"Murali",21000);
		Employee e3=new Employee(533,"Vishnu",22000);
		Employee e4=new Employee(534,"Ajay",23000);
		Employee e5=new Employee(535,"Risheendra",24000);
		Employee e6=new Employee(536,"Saikiran",25000);
		Employee e7=new Employee(537,"Shashank",26000);
		Employee e8=new Employee(538,"Surya",27000);
		Employee e9=new Employee(539,"Akhileshwar",28000);
		Employee e10=new Employee(540,"Manohar",29000);
		
		Employee[] arr={e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].empId +" "+ arr[i].empName + " " + arr[i].empSal );
		}
	}
	
	public void add()
	{
		
	}
}
