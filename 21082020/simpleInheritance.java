import java.util.Scanner;
class Circle
{
	Circle(){	}
	int radius;
	void setRadius(int radius){
		this.radius=radius;
	}
	int getRadius(){
		return radius;
		}
	double computeArea(){
		return (3.14*radius*radius);
		}
	double computePerimeter(){
		return 2*3.14*radius;
		}
}
class Cone extends Circle
{
	int height;
	Cone(){	}
	void setHeight(int height){
		this.height=height;	
	}
	int getHeight(){
		return height;
		}
	double volume(){
		double v=(computeArea()*height)/3;
		return v;
	}

}
class simpleInheritance{
	public static void main(String[] args)
	{
		int radius;
		int height;
		double vol;
		Cone cn=new Cone();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius and height");
		radius=sc.nextInt();
		height=sc.nextInt();
		cn.setRadius(radius);
		cn.setHeight(height);
	
		vol=cn.volume();
		System.out.println("volume of cone is "+vol);
	}
}	