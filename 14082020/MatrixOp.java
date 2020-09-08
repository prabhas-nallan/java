import java.util.Scanner;
class MatrixOp
{
 int A[][];
 int M[][];
 Scanner sc=new Scanner(System.in);
 MatrixOp(){	}
 MatrixOp(int rows,int cols)
 {
	 A=new int[rows][cols];
	 M=new int[rows][cols];
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
 void addMatrix(MatrixOp o1,MatrixOp o2)
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
 void mulMatrix(MatrixOp o1,MatrixOp o2)
 {
	System.out.println("multiplication of matrices is:");
	for(int i=0;i<A.length;i++)
	{
		for(int j=0;j<A[0].length;j++)
		{	
			this.M[i][j]=0;
			for(int k=0;k<o2.A.length;k++)
			{
				this.M[i][j]=this.M[i][j]+o1.A[i][k]*o2.A[k][j];
			}
			System.out.print(M[i][j]+"");
		}
		System.out.println();
	}
 }
}