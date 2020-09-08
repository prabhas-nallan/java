import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
	int n,i,m=0,cnt=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no.");
	n=sc.nextInt();
	sc.nextLine();
	m=n/2;
	if(n==0||n==1)
	{
 		System.out.println(n+"is not a prime no.");
	}
	else
	{
 		for(i=2;i<=m;i++)
 			{
  			 if(n%i==0)
  			 {
   				System.out.println(n+"is not a prime no.");
				cnt=1;
   				break;
  			 }
 			}
 		if(cnt==0)
 		{
  			System.out.println(n+"is a prime no.");
 		}	
	}
	}
}

