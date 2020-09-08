import java.util.Scanner;
class Rectangle
{
int length,breadth;
	void setData(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
	void setLength(int l1)
	{
		this.length=l1;
	}
	void setBreadth(int b1)
	{
		this.breadth=b1;
	}
	int area()
	{
		int a;
		a=this.length*this.breadth;
		return a;
	}
	int perimeter()
	{
		int p;
		p=2*(this.length+this.breadth);
		return p;
	}
}
public class setRectangle
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Scanner sc=new Scanner(System.in);
		int l2,b2;
		System.out.println("Enter length and breadth of the rectangle");
		l2=sc.nextInt();
		b2=sc.nextInt();
		r1.setData(l2,b2);
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		sc.close();
	}
}