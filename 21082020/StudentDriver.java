import java.util.Scanner;

class Student{
	int Studno;
	String Name;
	static String Clgname;
	double marks[];
	double total;
	double Markssum;
	static double Totalmarks;
	Student(){	}
	static {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter clg name");
		Clgname=s.nextLine();
		}
	Student(int sno,String name,double m[]){
		this.Studno=sno;
		this.Name=name;
		
		marks=new double[m.length];
		for(int i=0;i<marks.length;i++){
			marks[i]=m[i];
			}
		}
	void setStudno(int No){
		this.Studno=No;
		}
	void setName(String s){
		this.Name=s;
		}	
	String getName(){
		return this.Name;
		}	

	int getStudno(){
		return this.Studno;
		}
	
	String getClgname(){
		return this.Clgname;
		}
	void computeMarkssum(){
		for(int i=0;i<this.marks.length;i++){
			this.total=this.total+this.marks[i];
			}
		}
	void computeTotalmarks(){
		
			Totalmarks=Totalmarks+this.total;
		
	}
	static void displayTotalmarks(){
		System.out.printf("%12.2f",Totalmarks);
		}	
	void display(){
		System.out.printf("%10d%20s%20s%10.2f\n",this.Studno,this.Name,this.Clgname,this.total);
		}

	static void sort(Student s[],Student s1)

	{
		
		int i;

		for(i=0;i<s.length-1;i++)

		{

			for(int j=0;j<s.length-1-i;j++){
			
				if(s[j].getStudno()>s[j+1].getStudno())

				{

					s1=s[j];

					s[j]=s[j+1];

					s[j+1]=s1;

				}

			}

		}

	}
	static void search(Student s[],String name)

	{

		int i; 
		int p=0;

		for(i=0;i<s.length;i++)

		{

			if(s[i].getName().equals(name))
			{

				s[i].display();

				p=1;

				
 			}

		}

		if(p==0)
			 System.out.println("Student not found");

	}


}
class StudentDriver
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter no. of students");
		n=sc.nextInt();
		Student s[]=new Student[n];
		Student s1=new Student();
		int rno;
		String name;
		String Clgname;
		double m[];
		m=new double[3];
		Scanner pq=new Scanner(System.in);
		
		for(int i=0;i<s.length;i++)
		{

			System.out.println("Enter studno");
			rno=sc.nextInt();

			System.out.println("Enter name");
			name=pq.nextLine();

			System.out.println("Enter marks");
			for(int j=0;j<3;j++){
				m[j]=sc.nextInt();
			}

			s[i]=new Student(rno,name,m);
			s[i].setStudno(rno);
			s[i].setName(name);
		}
		for(int i=0;i<s.length;i++){
			s[i].computeMarkssum();
			s[i].computeTotalmarks();
		}
		int c;
		do

		{

			System.out.println("Enter your choice");

			System.out.println("1.Sort\n2.Search\n3.Display\n4.Exit");

			
			c=sc.nextInt();

			switch(c)

			{

				case 1: Student.sort(s,s1);

					System.out.println("Display to see Sorted order");

					break;

				case 2:System.out.println("Enter the name you want to search:");

					name=pq.nextLine();
	
				Student.search(s,name);
	
				break;

				case 3:	System.out.printf("%10s%20s%20s%10s","STUDNO","NAME","CN","TOTAL");
					System.out.println("");
					for(int i=0;i<s.length;i++){
					s[i].display();
					}
		
					Student.displayTotalmarks();
					break;
				
				case 4:break;
				default:System.out.println("Enter a valid option: ");

			}

		}while(c!=4);



		


	}
}
			




