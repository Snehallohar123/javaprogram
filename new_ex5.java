import java.util.*;
class person
{
	String name;
	String birth;
	String address;
	Double weight,height;
	person(String s,String b,String a,Double w,Double h)
	{
		name=s;
		birth=b;
		address=a;
		weight=w;
		height=h;
	}
		
}
class student extends person
{
	
	int rn,mark1,mark2,mark3;
	float avg;
	student(String s,String b,String a,Double w,Double h ,int rollno,int m1,int m2,int m3){
		super(s,b,a,w,h);
		mark1=m1;
		mark2=m2;
		mark3=m3;
		rn=rollno;
	}
	void calculateavg()
	{
		avg=(float)(mark1+mark2+mark3)/3;
		System.out.println("average mark is :="+avg);
	}
}
class employee extends person
{
	String empId;
	Double salary;
	double tax;
	employee(String s,String b,String a,Double w,Double h ,String e,Double sal)
	{
		super(s,b,a,w,h);
		empId=e;salary=sal;
	}
	void cal_tax()
	{
		tax=salary*0.04;
		System.out.println("tax is="+tax);
	}
}
class inheritance
{
	public static void main(String args[])
	{
	 	Scanner sc=new Scanner(System.in);
		String s,b,a;
		Double w,h;
		System.out.println("name,birth,addess,weight,height");
		s=sc.nextLine();
		b=sc.nextLine();
		a=sc.nextLine();
		w=sc.nextDouble();
		h=sc.nextDouble();	
		int rollno,m1,m2,m3;
		System.out.println("enter the rollno,m1,m2,m3");
		rollno=sc.nextInt();
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		student s1=new student(s,b,a,w,h,rollno,m1,m2,m3);
		s1.calculateavg();
		Double sal=sc.nextDouble();
		String id=sc.nextLine();		
		employee e=new employee(s,b,a,w,h,id,sal);
		e.cal_tax();
	} 
	
	
}