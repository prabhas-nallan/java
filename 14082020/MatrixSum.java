import java.util.Scanner;
class MatrixSum
{
 int A[][];
 Scanner sc=new Scanner(System.in);
 MatrixSum(){	}
 MatrixSum(int rows,int cols)
 {
	 A=new int[rows][cols];
 }
 void fillMatrix()
 {
	System.out.println("Enter the elements into the array");
	for(int i=0;i<A.length;i++)
	{
		for(int j=0;j<A[0].length;j++)
		{
			A[i][j]=sc.nextInt();
		}
	}
 }
 void displayMatrix()
 {
	System.out.println("Array elements are:");
	for(int i=0;i<A.length;i++)
	{
		for(int j=0;j<A[0].length;j++)
		{
			System.out.print(A[i][j]+"");
		}
		System.out.println();
	}
 }
 void addMatrix(MatrixSum o1,MatrixSum o2)
 {
	System.out.println("Sum of matrices is:");
	for(int i=0;i<A.length;i++)
	{
		for(int j=0;j<A[0].length;j++)
		{
			this.A[i][j]=o1.A[i][j]+o2.A[i][j];
			System.out.print(A[i][j]+"");
		}
		System.out.println();
	}
 }
}