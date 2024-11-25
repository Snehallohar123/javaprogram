import java.util.*;
class employee
{
	String name;
	Double salary;
	employee()
	{
	 name="";
	salary=0.00;	
	}
	void setname(String n)
	{
		name=n;
	}
	String getname()
	{
		return name;
	}
	void setsalary(Double s)
	{
		salary=s;
	}
	Double getsalary()
	{
		return salary;
	}
	void raisesalary(Double salary)
	{
		Double raise_sal=salary+(0.1*salary);
		System.out.println("raise salary of employee is :="+raise_sal); 
	}
	
}
class check_salary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name;
		Double salary;
		name=sc.nextLine();
		salary=sc.nextDouble();	
		employee e=new employee();
		e.setname(name);
		System.out.println("name of employee :"+ e.getname());
		e.setsalary(salary);	
		System.out.println("salary of employee :"+ e.getsalary());
		e.raisesalary(salary);
		

	}
	
	
}