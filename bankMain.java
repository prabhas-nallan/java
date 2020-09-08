import java.util.Scanner;
class bankMain
{
	public static void main(String args[])
	{
		BankAccount a1=new BankAccount();
		Scanner sc=new Scanner(System.in);
		double b,d,w;
		String ah,an;
		System.out.println("Enter account no,name,balance");
		an=sc.nextLine();
		ah=sc.nextLine();
		
		b=sc.nextDouble();
		a1.setaccHolderName(ah);
		a1.setaccNo(an);
		a1.setBalance(b);
		while(true)
		{
 		 System.out.println("Enter choice\n 1 for deposit\n 2 towithdraw amount\n 3 to check balance \n 4 to exit\n");
		 System.out.println("Enter your choice");
		 int choice=sc.nextInt();
		 sc.nextLine();
		 switch(choice)
		 {
			case 1:System.out.println("Enter the amount to be deposited");
			       d=sc.nextDouble();
			       sc.nextLine();
			       double depo=a1.deposit(d);
		    	       System.out.println("Current Balance:"+depo);
			       break;
			case 2:System.out.println("Enter the amount to be withdrawn");
			       w=sc.nextDouble();
			       sc.nextLine();
			       double with=a1.withdraw(w);
		    	       System.out.println("Current Balance:"+with);
			       break;
			case 3:
			       System.out.println("current balance is:"+a1.getBalance());
			       break;
			case 4:System.out.println("exited");
  			       System.exit(0);
			default:System.out.println("invalid input");
				break;
		  }
		  System.out.println("Thankyou visit again\n" );
		 }
	}
}