import java.util.*;
class date
{
	int day,month,year;
	date(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
	}
	
	int leap()
	{
		if(year%4==0 && year%100!=0 ||year%400==0)
		{
			return 1;
		}
		else
			return 0;
	}

	long cal_date()
		{
			int num_leap = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
			int remain_year=year-1-num_leap;
			long totalday=(366*num_leap)+(365*remain_year);
			int days[]={31,28+leap(),31,30,31,30,31,31,30,31,30,31};
			for(int i=0;i<month-1;i++)
			{
				totalday+=days[i];
			}
			totalday+=day;
			return totalday;
		}
	public static void main(String []args)
		{
			int month,year,day;
			Scanner sc=new Scanner(System.in);
			day=sc.nextInt();
			month=sc.nextInt();
			year=sc.nextInt();
			
			date d=new date(day,month,year);
			long totalday=d.cal_date();
			int dayz=(int)(totalday+6)%7;
			switch(dayz)
			{
				case 0:
				System.out.println("saturday");
				break;
				case 1:
				System.out.println("sunday");
				break;
				case 2:
				System.out.println("monday");
				break;
				case 3:
				System.out.println("tuesday");
				break;
				case 4:
				System.out.println("wen");
				break;
				case 5:
				System.out.println("thursaday");
				break;
				case 6:
				System.out.println("friday");
				break;
			}
		}
}
