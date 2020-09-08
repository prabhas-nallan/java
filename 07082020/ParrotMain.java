import java.util.Scanner;
class ParrotMain
{
  public static void main(String args[])
  {
	int age;
	String clr,nm;
	Scanner sc=new Scanner(System.in);
	age=sc.nextInt();
	sc.nextLine();
	clr=sc.nextLine();
	nm=sc.nextLine();
	Parrot P1=new Parrot(nm,age,clr);
	Parrot P2=new Parrot(P1);
	System.out.println("Enter 2nd parrot name: \n");
	nm=sc.nextLine();
	P2.setName(nm);
	Parrot P3=new Parrot(P1);
	System.out.println("Enter 3rd parrot name: \n");
	nm=sc.nextLine();
 	P3.setName(nm);
	P1.display();
	P2.display();
	P3.display();
  }
}