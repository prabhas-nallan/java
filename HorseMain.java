class Horse
{
	int age;
	int weight;
	String color;
	void initialize(int a,int w,String c)
	{
	 age=a;
	 weight=w;
	 color=c;
	}
	void display()
	{
	 System.out.println(age+" "+weight+" "+color);
	}
}
class HorseMain
{
	public static void main(String[] args)
	{
	 Horse h1=new Horse();
	 Horse h2=new Horse();
	 h1.initialize(40,99,"black");
	 h2.initialize(50,98,"white");
	 h1.display();
	 h2.display();
	}
}