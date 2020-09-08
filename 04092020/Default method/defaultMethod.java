interface Vechile{
		String getBrand();
		String speedUp();
		String slowDown();
	default String turnAlarmOn(){
		return "Turning the vechile alaram on";
	}
	default String turnAlarmOff(){
		return "Turing the vechile alarm off";
	}
}
class Car implements Vechile{
	
	String brand;
	public void setBrand(String n){
		brand=n;
	}
	public String getBrand(){
		return brand;
	}

	public String speedUp(){
		return "The car is Speeding up";
	}

	public String slowDown(){
		return "The car is slowing down";
	}
}
class defaultMethod
{
	public static void main(String[] args){
	
		Car c=new Car();
		
		c.setBrand("BMW");
		
		System.out.println("if speed>60 "+ c.speedUp());
		System.out.println("if speed<40 "+ c.slowDown());
		System.out.println("using default"+ c.turnAlarmOn());
		
		System.out.println("using 2nd default"+ c.turnAlarmOff());
		
	}
}