import java.util.Scanner;
public class MatrixopDriver
{
 public static void main(String args[])
 {
	int m,n,p,q;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of matrix 1");
	m=sc.nextInt();
	sc.nextLine();
	n=sc.nextInt();
	System.out.println("Enter the size of matrix 2");
	p=sc.nextInt();
	sc.nextLine();
	q=sc.nextInt();
	MatrixOp o1=new MatrixOp(m,n);
	MatrixOp o2=new MatrixOp(p,q);
	MatrixOp o3=new MatrixOp(m,q);
	MatrixOp o4=new MatrixOp(m,q);
	o1.fillMatrix();
	o1.displayMatrix();
	o2.fillMatrix();
	o2.displayMatrix();
	if((m==p)&&(n==q))
		o3.addMatrix(o1,o2);
	else
		System.out.println("You cannot perform addition operation");
	if(n==p)
		o4.mulMatrix(o1,o2);
	else
		System.out.println("You cannot perform multiplication operation");
	
	sc.close();
 }
}