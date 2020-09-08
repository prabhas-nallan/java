import java.util.Scanner;
class Flight
{
	String name[][];
	int count=0,max;
	Scanner sc = new Scanner(System.in);
	Flight(int m,int n)
	{
		name = new String[m][n];
		count=m*n;
		max=count;
	}
	void display()
	{
		int i,j;
		for(i=0;i<name.length;i++)
		{
			for(j=0;j<name[0].length;j++)
			{
				System.out.print(name[i][j]+"  ");
			}
			System.out.println();
		}
	}
	void setPosition()
	{	
		int p,q;
		String name1;
		if(getSeatAvailable()==0)
		{
			System.out.println("No seats are available");
		}
		else
		{
			System.out.println("Enter name of the passenger");
			name1 = sc.nextLine();
			display();
			System.out.println("Choose your seat");
			System.out.println("Enter row number and column number");
			p = sc.nextInt();
			q = sc.nextInt();
			sc.nextLine();
			name[p][q]=name1;
			count = count-1;
		}
		display();			
	}
	int getSeatAvailable()
	{
		return count;
	}
	void cancelTicket()
	{
		int i,j,p=0;
		String name1;
		if(getSeatAvailable()==max)
		{
			System.out.println("Please add a passenger");
		}
		else
		{
			System.out.println("Enter name of the passenger");
			name1=sc.nextLine();
			for(i=0;i<name.length;i++)
			{
				for(j=0;j<name[0].length;j++)
				{
					try{
						if(name[i][j].equals(name1))
						{
							name[i][j]=null;
							count=count+1;
							p=1;
						}
					   }
					catch(Exception e){  }
				}
			}
			if(p==0)
			{
				System.out.println("Cancellation is not successfull");
			}
			else
			{
				System.out.println("Cancellation is successfull");
			}
			display();
		}
		
	}
			
}