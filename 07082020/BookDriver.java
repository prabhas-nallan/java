import java.util.Scanner;
class Book
{
 String name;
 String gender;
 String mail;
 Book(){	}
 Book(String name,String gender)
 {
	this.name=name;
	this.gender=gender;
 }
 Book(String name,String gender,String mail)
 {
	this(name,gender);
 	this.mail=mail;
 }
 void setMail(String mail)
 {
	this.mail=mail;
 }
 void display()
 {
	System.out.println(this.name+" "+this.gender+" "+this.mail);
 }
}
class BookDriver
{
 public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name,gender,mail of B1");
	String n1=sc.nextLine();
	String g1=sc.nextLine();
	String m1=sc.nextLine();
	System.out.println("Enter name,gender,mail of B2");
	String n2=sc.nextLine();
	String g2=sc.nextLine();
	String m2=sc.nextLine();
	Book B1=new Book(n1,g1,m1);
	Book B2=new Book(n2,g2);
	B2.setMail(m2);
	B1.display();
	B2.display();
 }
}
