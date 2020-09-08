class rectangle
{
	int length;
	int breadth;
	double area;
	double peri;
	void setData(int l,int b)
	{
	 length=l;
	 breadth=b;
	}
	void computearea()
	{
	 area=length*breadth;
	}
	void computeperi()
	{
	 peri=2*(length+breadth);
	}
	void display()
	{
	 System.out.print(length+" "+breadth+" "+area+" "+peri);
	 System.out.println();
	} 
}
class rectangleMain
{
	public static void main(String args[])
	{
	 rectangle r1=new rectangle();
	 rectangle r2=new rectangle();
	 r1.setData(3,4);
	 r2.setData(6,2);
	 r1.computearea();
	 r1.computeperi();
	 r2.computearea();
	 r2.computeperi();
	 r1.display();
	 r2.display();
	}
}