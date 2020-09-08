import java.util.Scanner;
class Employee
{
	private int Emno;
	private String Name;
	private double Basicpay;
	private double netsalary;
	Employee(){	}
	Employee(int Emno,String Name,double Basicpay)
	{
	 this.Emno=Emno;
	 this.Name=Name;
	 this.Basicpay=Basicpay;
	}
	void computeNetsalary()
	{
	 if(Basicpay>=12000)
		this.netsalary=Basicpay*.2+Basicpay*.8-Basicpay*.12;
	 else
		this.netsalary=Basicpay+Basicpay*.15+Basicpay*.5-Basicpay*.12;
	}
	void display()
	{
		System.out.println("Emno:"+this.Emno);
		System.out.println("Name:"+this.Name);
		System.out.println("netsalary:"+this.netsalary);
	}
}
class EmpDriver
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Emno;Name;Basicpay");
		str=sc.nextLine();
		String strings[]=str.split(";");
		Employee E1=new Employee(Integer.parseInt(strings[0]),strings[1],Double.parseDouble(strings[2]));
		E1.computeNetsalary();
		System.out.println("\n");
		E1.display();
	}
}