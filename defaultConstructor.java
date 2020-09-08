import java.util.Scanner;
public class defaultConstructor
{
	private int age;
	private String name;
	void setAge(int a)
	{
		this.age=a;
	}
	void setName(String n)
	{
		this.name=n;
	}
	int getAge()
	{
		return this.age;
	}
	String getName()
	{
		return this.name;
	}
	public static void main(String args[])
	{
		defaultConstructor d1=new defaultConstructor();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int a1=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		String s1=sc.nextLine();
		d1.setAge(a1);
		d1.setName(s1);
		System.out.println(d1.getAge());
		System.out.println(d1.getName());
		sc.close();
	}
}