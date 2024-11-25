import java.util.*;
interface stackQueue
{
	public void push(int data);
	public void pop();
	public void display();
}
class stack implements stackQueue
{
	int top;
	int arr[];
	int size;
	stack(int n)
	{
		top=-1;
		size=n;
		arr=new int[size];
	}
	public void push(int data)
	{
		if(top==size-1)
		{
			System.out.println("stack empty");
		}
		else
		{
			top++;
			arr[top]=data;
			
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("stack empty");
		}
		else
		{
			int data=arr[top];
			System.out.println("poped data is :="+data);
			top--;	
		}
		
	}
		
	public void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}

class test
{
	public static void main(String args[])
	{
		stack s=new stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		s.pop();
	}
}