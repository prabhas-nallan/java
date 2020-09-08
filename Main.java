class Student
{
	int studno;
	String name;
	String address;
	void initialize(int no,String n,String ad)
	{
	 studno=no;
	 name=n;
	 address=ad;
	}
	void display()
	{
	 System.out.println(studno+" "+name+" "+address);
	}
}
class Main
{
	public static void main(String[] args)
	{
	 Student s1=new Student();
	 Student s2=new Student();
	 s1.initialize(501,"praba","cvrce");
	 s2.initialize(502,"anil","cvrce");
	 s1.display();
	 s2.display();
	}
}