abstract class Employee {
   protected String Name;
   protected int Empno;
   Employee() { }
   Employee(String name,int no) {
      this.Name=name;
      this.Empno=no;
   }
   void display() { }
   abstract void calculateSalary() ;
}

class MBEmployee extends Employee {
   private double Bpay,Hra,Da,Npay;
   MBEmployee(String name,int no,double bpay,double hra,double da) {
      super(name,no);
      this.Bpay=bpay;
      this.Hra=hra;
      this.Da=da;
   }
   void calculateSalary() {
      this.Npay = Bpay + 0.2*Hra + 0.5*Da ;
   }
   void display() {
      System.out.println("Name : "+this.Name);
      System.out.println("Empno : "+this.Empno);
      System.out.println("Net Salary : "+this.Npay);
   }
}

class CBEmployee extends Employee {
   private double Hrs,Wages,Npay;
   CBEmployee(String name,int no,double hrs,double wages) {
      super(name,no);
      this.Hrs=hrs;
      this.Wages=wages;
   }
   void calculateSalary() {
      this.Npay = Hrs * Wages ;
   }
   void display() {
      System.out.println("Name : "+this.Name);
      System.out.println("Empno : "+this.Empno);
      System.out.println("Net Salary : "+this.Npay);
   }
}
   
class EmpDriver {
   public static void main(String[] args) {
       Employee E1;
       E1 = new MBEmployee("Anil",1,10000.0,2000.0,1500.0);      
       E1.calculateSalary();
       E1.display();
       E1 = new CBEmployee("Ash",1,8.0,15000.0);
       E1.calculateSalary();
       E1.display();
   }
}