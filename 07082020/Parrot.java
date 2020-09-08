class Parrot
{
 int age;
 String name,color;
 Parrot(){	}
 Parrot(String name,int age,String color)
 {
	this.name=name;
	this.age=age;
	this.color=color;
 }
 Parrot(Parrot P1)
 {
	this.name=P1.name;
	this.age=P1.age;
	this.color=P1.color;
 }
 void setName(String name)
 {
	this.name=name;
 }
 void display()
 {
	System.out.println("Parrot name:"+this.name);
	System.out.println("Parrot age:"+this.age);
	System.out.println("Parrot color:"+this.color);
 }
}