import java.util.ArrayList;
class Book
{
	String bname,publisher;
	int price,edition;
	Book(String b,String p,int pr,int ed)
	{
		bname=b;
		publisher=p;
		price=pr;
		edition=ed;
	}
	void display()
	{
		System.out.println("the name of book is :"+bname);
		System.out.println("the name of publisher is :"+publisher);
		System.out.println("the price of book is :"+price);
		System.out.println("the edition of book is :"+edition);
	}
}
class blist
{
	public static void main(String args[])
	{
	
		Book b1=new Book("snehal","rutu",100,1);
		Book b2=new Book("diya","raj",200,2);
		ArrayList <Book> list1=new ArrayList <Book>(2);
		list1.add(b1);
		list1.add(b2);
		for(Book b:list1)
		{
		 b.display();
		}
		
	}
}
