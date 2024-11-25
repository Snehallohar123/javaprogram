import java.util.*;
class matrix
{


	public static void main(String []args)
	{
		matrix m1=new matrix();
		m1.getmatrix1();
		m1.getmatrix2();
		m1.addition();
	}
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	void getmatrix1()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}	
	}
	
	void getmatrix2()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
	}
	
	void addition()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	
}