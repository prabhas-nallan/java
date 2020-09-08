import java.util.Scanner;
public class DDDriver
{
 public static void main(String args[])
 {
	int rows,cols;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of matrix rowsXcols");
	rows=sc.nextInt();
	sc.nextLine();
	cols=sc.nextInt();
	DDCore o1=new DDCore(rows,cols);
	o1.fillMatrix();
	o1.displayMatrix();
	sc.close();
 }
}