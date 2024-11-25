import java.util.*;
class MathOperation
{
 static void Addition(int num1,int num2) throws MyException
{
 int ans=num1+num2;
 	if(ans>1000)
 		throw new MyException("Too Long Addition exception");
 	else
 	{
 		System.out.println("The result is"+ans);
 	}
} 
static void Subtraction(int num1,int num2) throws MyException
{
 int ans=num1-num2;
 	if(ans<0)
 		throw new MyException("not valid");
	 else
 	{
 		System.out.println("The result is"+ans);
 	}
} 
static void Multiplication(int num1,int num2) throws MyException
{
 int ans=num1*num2;
	 if(ans>5000)
 		throw new MyException("not valid");
 	else
 	{
		 System.out.println("The result is"+ans);
 	}
} 
static void Division(int num1,int num2) throws MyException
{
	try
	{
 		int ans=num1/num2;
  		System.out.println("The result is"+ans);
  	 }	
	catch(NullPointerException e)
	{
		System.out.println("Exception occured: "+e);
	}

} 
public static void main(String args[])
{
 	try
	{
 		Division(13,0);
 	}
	catch(Exception m)
	{
		System.out.println("Exception occured: "+m);
	}

 	System.out.println("rest of the code...");
 	}
}
