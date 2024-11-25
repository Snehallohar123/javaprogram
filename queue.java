import java.util.Scanner;
interface queue
{
	public int enqueue(int data);
	public void dequeue();
	public void display();
	
}
class queue1 implements queue
{
		int rear,front,arr[];
		queue1(int n)
		{
		rear=-1;
		front=-1;
		arr=new int[n];
		}
		public int enqueue(int data)
		{
			if(rear==arr.length-1)
			{
				return -1;
			}
			else
			{
				if(rear==front)
				{
					rear++;
					front++;
					arr[rear]=data;
				}
				else
				{
					rear++;
					front++;
				arr[rear]=data;
				}
			}
			return arr[rear];
		}
		public void dequeue()
		{
			int data;
			if(rear==-1)
			{
				System.out.println("queue is empty");
			}
			else
			{
				data=arr[front];
				if(rear==front)
				{
					rear=-1;
				}
				else
				{
				front++;
				}
				System.out.println("deque data is :"+ data);

			}
					}
		public void display()
		{
			for (int i=front;i<=rear;i++)
			{
				System.out.println(arr[i]);
			}
		}
}
class main
{
	public static void main(String []args)
		{
			queue1 q=new queue1(5);
			q.enqueue(10);
			q.display();
			//q.dequeue();
		}
}
