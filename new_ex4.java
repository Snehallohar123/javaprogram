

import java.util.*;
class SavingsAccount
{
  private String account_name;
  private int account_no;
  private String branch;
  private double balance;
  private static double annualInterestRate;
  
  SavingsAccount(String n,int no,String b,double bal,double aIR)
  {
    account_name=n;
    account_no=no;
    branch=b;
    balance=bal;
    annualInterestRate=aIR;
  }
  
  String getAcco
untName()
  {
     return account_name;
  }
  int getAccountNo()
  {
     return account_no;
  }
  String getBranch()
  {
     return branch;
  }
  double getBalance()
  {
    return balance;
  }
  double getAnnualInterestRate()
  {
    return annualInterestRate;
  }
   void setAccountName(String na)
  {
     account_name=na;
  }
  void setAccountNo(int nu)
  {
     account_no=nu;
  }
  void setBranch(String br)
  {
     branch=br;
  }
  void setBalance(double bl)
  {
    balance=bl;
  }
  static double modifyInterestRate(double r)
  {
    annualInterestRate=r;
    return annualInterestRate;
  } 
  double calculateMounthlyInterest()
     {
       double mounthlyInterest=getBalance()*(getAnnualInterestRate()/12);
       return mounthlyInterest;
      }
}
class SavingsAccountTest1
{
   public static void main(String[] arg)
   {
     SavingsAccount sever1=new SavingsAccount("Tejal Divekar",150,"RBI",2000.00,0.04);
     SavingsAccount sever2=new SavingsAccount("Pratiksha Kumbhar",300,"SBI",3000.00,0.05);
     Scanner sc=new Scanner(System.in);

     System.out.println("SEVER 1 Info Before modifying Annual Interest Rate\n");
     System.out.println("Account name :- "+sever1.getAccountName());
     System.out.println("Account No :- "+sever1.getAccountNo());
     System.out.println("Branch :- "+sever1.getBranch());
     System.out.println("Annual Interest Rate :- "+sever1.getAnnualInterestRate());  
     System.out.println("Balance :- "+(sever1.getBalance()+sever1.calculateMounthlyInterest()));
     
     System.out.println("\n\nSEVER 2Info Before modifying Annual Interest Rate\n");
     System.out.println("Account name :- "+sever2.getAccountName());
     System.out.println("Account No :- "+sever2.getAccountNo());
     System.out.println("Branch :- "+sever2.getBranch());
     System.out.println("Annual Interest Rate :- "+sever2.getAnnualInterestRate());  
     System.out.println("Balance :- "+(sever2.getBalance()+sever2.calculateMounthlyInterest()));
     
     System.out.println("\nEnter changed annual interest rate :-");
     double r=sc.nextDouble();
 
     System.out.println("\nSEVER 1 Info after modifying Annual Interest Rate\n");

     System.out.println("Annual Interest Rate :- "+sever1.modifyInterestRate(r));
     System.out.println("Balance :- "+(sever1.getBalance()+sever1.calculateMounthlyInterest())); 

     System.out.println("\nSEVER 2 Info Before modifying Annual Interest Rate\n");

     System.out.println("Annual Interest Rate :- "+sever2.modifyInterestRate(r));
     System.out.println("Balance :- "+(sever2.getBalance()+sever1.calculateMounthlyInterest())); 

     
   }
 }
