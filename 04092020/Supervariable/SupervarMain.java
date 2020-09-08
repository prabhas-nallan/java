class Vehicle
{
 int maxSpeed=120;
 void message()
 {
	System.out.println("Dont go speed");
 }
}

class Car extends Vehicle
{
 int maxSpeed=180;
 void message()
 {
	System.out.println("This speed is too dangerous");
 }
 void display()
 {
	super.message();
	message();
	System.out.println("Maximum speed :"+super.maxSpeed);
 }
}
class SupervarMain
{
 public static void main(String args[])
 {
	Car o1=new Car();
	o1.display();
 }
}