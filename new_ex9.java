import java.util.*;
import java.io;
class createfile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String filename=sc.nextLine();
		writefile(filename,sc);
		read_file(filename,sc);	
	}	
		
	public void writefile(String filename,Scanner sc)
	{	try(
		FileWrite writer=new FileWrite(filename))
		{
		String content=sc.nextline();
		writer.write(content +"\n");
		System.out.println("content write successfully!!");
		}
	
		catch(IOException e)
		{
		System.out.println("error occur"+ e.getmessage());
		}

	}	
	

	public void read_file(String filename,Scanner sc)
	{
		try(BufferedReader reader=new BufferedReader(new Filereader(filename)))
		{
			String content;
			while((content=reader.readLine()) != null)
			{
				System.out.print(content);
			}
		}
		catch(IOException e)
	{
		System.out.println("error occur"+ e.getmessage());
	}

	}	
		
}