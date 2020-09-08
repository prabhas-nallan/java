class circle
{
	int radius;
	double area;
	double peri;
	void setData(int r)
	{
	 radius=r;
	}
	void computearea()
	{
	 area=3.14*radius*radius;
	}
	void computeperi()
	{
	 peri=2*3.14*radius;
	}
	void display()
	{
	 System.out.print(radius+" "+area+" "+peri);
	 System.out.println();
	} 
}
class circleMain
{
	public static void main(String args[])
	{
	 circle c1=new circle();
	 circle c2=new circle();
	 c1.setData(3);
	 c2.setData(6);
	 c1.computearea();
	 c1.computeperi();
	 c2.computearea();
	 c2.computeperi();
	 c1.display();
	 c2.display();
	}
}