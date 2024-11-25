import java.util.*;

class MathOperation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        // Prompt for user input
        System.out.println("Enter the first number (n1):");
        n1 = sc.nextInt();

        System.out.println("Enter the second number (n2):");
        n2 = sc.nextInt();

        // Call the Addition method
        Addition(n1, n2);
	Substraction(n1,n2);
    }

    static void Addition(int n1, int n2) {
        try {
            
            int add = n1 + n2;
            if (add > 1000) {
                System.out.println("The addition is: " + add);
            } 
		else 
		{
                
                throw new Exception("The sum is less than or equal to 1000: " + add);
            }
        } 
	catch (Exception e) {
            
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
	
	static void Substraction(int n1,int n2)
	{
		try
		{
			int sub=n1-n2;
			if(sub>0)
			{
				System.out.println("the substraction is :="+sub);
			}
			else
			{
				throw new Exception("the sub is less than 0 "+sub);
			}
		}
		catch(Exception e)
		{
			System.out.println("the error occur :"+ e.getMessage());
		}
	}
}
