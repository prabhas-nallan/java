import java.util.Scanner;
class Rectangle
{
int length,breadth;
	Rectangle(){	}
	Rectangle(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
	void setLength(int l)
	{
		this.length=l;
	}
	void setBreadth(int b)
	{
		this.breadth=b;
	}
	int getLength()
	{
		return this.length;
	}
	int getBreadth()
	{
		return this.breadth;
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
class SetconsRect
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Scanner sc=new Scanner(System.in);
		int l2,b2;
		System.out.println("Enter length and breadth of the rectangle");
		l2=sc.nextInt();
		b2=sc.nextInt();
		r1.setLength(l2);
		r1.setBreadth(b2);
		System.out.println("Area:"+r1.area());
		System.out.println("Peri:"+r1.perimeter());
		sc.close();
	}
}