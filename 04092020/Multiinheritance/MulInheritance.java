abstract class Animal implements Pet
{
	public abstract void speak();
	
}
interface Pet 
{
	void play();
}

class Dog extends Animal{
	Dog(){	}
	public void speak(){
		System.out.println("Bow Bow");
	}
	public void play(){
		System.out.println("I play....");
	}
}


class MulInheritance
{
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.speak();
		d.play();
	}
}