import java.util.Scanner;
class Fruit
{
 int no;
 String name;
 static int count;
 Fruit (String name)
 {
	count++;
	this.no=count;
	this.name=name;
 }
 void display()
 {
	System.out.println("Fruit no : "+this.no);
	System.out.println("Fruit name : "+this.name);
 }
 static void displayCount()
 {
	System.out.println(count+"fruits");
 }
}
class FruitDriver
{
 public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	Fruit f1=new Fruit("mango");
	Fruit f2=new Fruit("apple");
	Fruit f3=new Fruit("banana");
	Fruit f4=new Fruit("orange");
	Fruit f5=new Fruit("grapes");
	f1.display();
	f2.display();
	f3.display();
	f4.display();
	f5.display();
	Fruit.displayCount();
 }
}