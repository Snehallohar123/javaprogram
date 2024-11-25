import java.util.*;
import java.io.*;
class readwrite
{
	public static void main(String args[])
	{
		try(Scanner sc=new Scanner(System.in);FileOutputStream fout=new FileOutputStream("new6.txt");PrintStream pr=new PrintStream(fout))
		{
			for(int i=0;i<2;i++)
			{
				System.out.println("1.prn 2.age 3.weight 4.height");
				String prn=sc.nextLine();
				int age=sc.nextInt();
				Double weight=sc.nextDouble();
				Double height=sc.nextDouble();
				sc.nextLine();
				pr.println(prn +"\t"+ age +"\t"+weight+"\t"+height);			
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found" + e.getMessage());
		}
		catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage()); // Handle other exceptions
        		}
		try(FileInputStream fin=new FileInputStream("new6.txt");DataInputStream dis=new DataInputStream(fin))
		{
			for(int i=0;i<2;i++)
			{
				String s=dis.readLine();
				System.out.println(s);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found"+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("error occur"+e.getMessage());
		}
		
	}
}
