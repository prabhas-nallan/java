import java.util.Scanner;
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
class StudentuserMain
{
public static void main(String[] args)
{
 Student s1=new Student();
 Student s2=new Student();
 Scanner sc=new Scanner(System.in);
 int no;
 String n;
 String ad;
 System.out.println("Enter student1 rollno,name and address");	
 no=sc.nextInt();
 sc.nextLine();
 n=sc.nextLine();
 ad=sc.nextLine();
 s1.initialize(no,n,ad);
 System.out.println("Enter student2 rollno,name and address");
 no=sc.nextInt();
 sc.nextLine();
 n=sc.nextLine();
 ad=sc.nextLine();
 s2.initialize(no,n,ad);
 s1.display();
 s2.display();
}
}