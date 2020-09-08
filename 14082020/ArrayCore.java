import java.util.Scanner;
import java.util.Arrays;
class ArrayCore
{
 int A[];
 ArrayCore(){	}
 ArrayCore(int size)
 {
	 A=new int[size];
 }
 void fillArray()
 {
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the elements into the array");
	for(i=0;i<A.length;i++)
	{
		A[i]=sc.nextInt();
	}
 }
 void displayArray()
 {
	System.out.println("Array elements are:");
	for(int e:A)
	 System.out.println(e);
 }
 double arraySum()
 {
	int i,sum=0;
	for(i=0;i<A.length;i++)
	{
		sum=sum+A[i];
	}
	return sum;
 }
 double arrayAverage()
 {
	double avg=this.arraySum()/A.length;
	return avg;
 }
 void arrayMin()
 {
 	float min=A[0];
	for(int i=1;i<A.length;i++)
	{
		if(A[i]<min)
		{
			min=A[i];
		}
	}
	System.out.println("Minimum element of array :"+min);
 }
 void arrayMax()
 {
 	float max=A[0];
	for(int i=1;i<A.length;i++)
	{
		if(A[i]>max)
		{
			max=A[i];
		}
	}
	System.out.println("Maximum element of array :"+max);
 }
 void SortArray()
 {
	System.out.println("Sorted order of");
	Arrays.sort(A);
	this.displayArray();
 }
 void BinarySearch()
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the key for B.S");
	int key=sc.nextInt();
	int result=Arrays.binarySearch(A,key);
	if(result<0)
	{
		System.out.println("Search element is not found");
	}
	else
	{
		System.out.println("Your element was found at index:"+result);
	}	
 }
 void LinearSearch()
 {
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the key for L.S");
	int key=sc.nextInt();
	for(i=0;i<A.length;i++)
	{
		if(A[i]==key)
		{
			System.out.println("Element is found at index"+i);
			break;
		}
	}
	if(i==A.length)
		System.out.println("Search element is not found in the array");
 }
}