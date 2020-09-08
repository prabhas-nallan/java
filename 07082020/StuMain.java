import java.util.Scanner;
class Stu
{
	int no;
	String name;
	String mail;
	Stu(){	}
	Stu(int no,String name,String mail)
	{
	 this.no=no;
	 this.name=name;
	 this.mail=mail;
	 this.display();
	}
	void display()
	{
	 System.out.println(this.no+" "+this.name+" "+this.mail);
	}
}
class StuMain
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter no,name,mail");
	 int no=sc.nextInt();
	 sc.nextLine();
	 String name=sc.nextLine();
	 String mail=sc.nextLine();
	 Stu s1=new Stu(no,name,mail);
	}
}