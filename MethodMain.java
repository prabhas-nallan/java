class MethodOverload
{
	void add(int a,int b)
	{
	 int c=a+b;
	 System.out.println(c);
	}
	void add(double a,double b) 
	{
	 double c=a+b;
	 System.out.println(c);
	}
	void add(int a,int b,int c) 
	{
	 System.out.println(a+b+c);
	}
}
class MethodMain
{
 public static void main(String args[])
 {
	MethodOverload m=new MethodOverload();
	m.add(5,4);
	m.add(5.0,4.0);
	m.add(3,2,4);
 }
}