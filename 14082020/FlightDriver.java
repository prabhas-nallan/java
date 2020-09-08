import java.util.Scanner;
class FlightDriver
{
	public static void main(String[] args)
	{
		int n,m,c,p,q;
		String name,name1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows and columns");
		m = sc.nextInt();
		n = sc.nextInt();
		sc.nextLine();
		
		Flight f = new Flight(m,n);
	
		do
		{
			System.out.println("Menu");
			System.out.println("1. Add a passenger");
			System.out.println("2. Remove a passenger");
			System.out.println("3. Quit");
			System.out.println("Enter your choice");
			c = sc.nextInt();
			if(c==1)
			{
				f.setPosition();
			}
			else if(c==2)
			{
				f.cancelTicket();
			}
			else if(c==3)
				break;
		}while(c<=3);
	}
}