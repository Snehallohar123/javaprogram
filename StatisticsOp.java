package MyMath;
public class StatisticsOp
{
	public void showMin(int n,int arr[])
	{
		int min=arr[0],i,j;
		for(i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
				
		}
		System.out.println("Min = "+min);
	}
	public void showMax(int n,int arr[])
	{
		int max=arr[0],i,j;
		for(i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
				
		}
		System.out.println("max = "+max);
	}
	public void showSumAvg(int n,int arr[])
	{
		int sum=0,i,j,count=0;
                double avg;
		for(i=0;i<n;i++)
		{
			sum=sum+arr[i];	
                        count++;	
		}
                avg=sum/n;
		System.out.println("Sum = "+sum);
                System.out.println("Avg = "+avg);
		System.out.println("Count = "+count);


	}

}
