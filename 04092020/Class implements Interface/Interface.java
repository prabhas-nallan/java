interface Figure
{
	double pi=3.14;
	void computeArea();
	void computePeri();
}

class Circle implements Figure
{
	int radius;
	double area;
	double peri;
	Circle(){	}
	Circle(int c){
		radius=c;
	}

	public void computeArea(){
		area=pi*radius*radius;
	}

	public void computePeri(){
		peri=2*pi*radius;
	}
	void display(){
		System.out.println("area= "+ area);
		System.out.println("Preimeter= " + peri);
	}
}

class Interface
{
	public static void main(String[] args){
		Circle obj=new Circle(5);	
		
		obj.computeArea();
		obj.computePeri();
		obj.display();
	}
}
		
				