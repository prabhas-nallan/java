import java.util.Scanner;
class Student
{
	private int rollno;
	private String name;
	private String address;
	void setData(int r,String n,String ad)
	{
	 this.rollno=r;
	 this.name=n;
	 this.address=ad;
	}
	void setName(String n)
	{
		this.name=n;
	}
	void setRollno(int r)
	{
		this.rollno=r;
	}
	void setAddress(String ad)
	{
		this.address=ad;
	}
	String getName()
	{
		return this.name;
	}
	int getRollno()
	{
		return this.rollno;
	}
	String getAddress()
	{
		return this.address;
	}
 
	void display()
	{
	 System.out.println(this.rollno);
	 System.out.println(this.name);
	 System.out.println(this.address);
	}
}
public class Studentsetget
{
	public static void main(String[] args)
	{
	 Student s1=new Student();
	 Student s2=new Student();
	 Scanner sc=new Scanner(System.in);
	 int num;
	 String paddress,pname;
	 System.out.println("Enter the rollno");
	 num=sc.nextInt();
	 sc.nextLine();
	 System.out.println("Enter the name");
	 pname=sc.nextLine();
	 System.out.println("Enter the address");
	 paddress=sc.nextLine();
	 s1.setData(num,pname,paddress);
	 s1.display();
	 System.out.println("Enter the address");
	 paddress=sc.nextLine();
	 s2.setAddress(paddress);
	 System.out.println(s2.getAddress());
	 sc.close();
	}
}