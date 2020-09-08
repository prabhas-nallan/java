import java.util.Scanner;
class ArrayDriver
{
 public static void main(String args[])
 {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	n=sc.nextInt();
	ArrayCore obj=new ArrayCore(n);
	obj.fillArray();
	obj.displayArray();
	System.out.println("Sum of array elements is:"+obj.arraySum());
	System.out.println("Average of array elements is:"+obj.arrayAverage());
	obj.arrayMin();
	obj.arrayMax();
	obj.SortArray();
	obj.BinarySearch();
	obj.LinearSearch();
 }
}