import java.util.Scanner;
class Horse
{
	private int Age;
	private double Weight;
	private String Color;
	void setdataHorse(int a,double w,String c)
	{
	 this.age=a;
	 this.weight=w;
	 this.color=c;
	}
	void setAge(int Age){	this.Age=Age;}
	void setWeight(double Weight){	this.Weight=Weight;}
	void setColor(String Color){	this.Color=Color;}
	int getAge(){	return(this.Age);}
	double getWeight(){	return(this.Weight);}
	String getColor(){	return(this.Color);}
	
	
	void display()
	{
	 System.out.println("age:"+this.Age);
	 System.out.println("weight:"+this.Weight);
	 System.out.println("color:"+this.Color);
	}
}
class HorseSetget
{
	public static void main(String[] args)
	{
	 Horse h1=new Horse();
	 Horse h2=new Horse();
	 int a;
 	 double w;
	 String c;
	 Scanner sc=new Scanner(System.in);
 	 System.out.println("Enter Horse1 details:age,weight,color");
	 a=sc.nextInt();
 	 w=sc.nextDouble();
	 sc.nextLine();
	 c=sc.nextLine();
 	 h1.setAge(a);
	 h1.setWeight(w);
 	 h1.setColor(c);
	 System.out.println("Enter Horse2 details:age,weight,color");
	 h1.setAge(a);
	 h1.setWeight(w);
 	 h1.setColor(c);
	 h1.display();
	 h2.display();
	}
}