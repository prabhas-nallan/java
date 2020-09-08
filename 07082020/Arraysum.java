import java.util.Scanner;
class Arraysum
{
 public static void main(String args[])
 {
	int i,sum=0,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of elements in array:");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements into the array");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		sum=sum+a[i];
	}
	System.out.println("Elements in the array are:");
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+"");
	}
	System.out.println("sum of elements in array:"+sum);
 }
}
	