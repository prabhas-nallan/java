import java.util.Scanner;
class OperatorMain
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  Arithe ar=new Arithe();        		
  logical lo=new logical();
  bitwise bt=new bitwise();

  int a,b;
  System.out.println("enter a no.");
  a=sc.nextInt();
  sc.nextLine();
  System.out.println("enter a no.");
  b=sc.nextInt();
  ar.setData(a,b);
  ar.add();
  ar.sub();
  ar.mul();
  ar.div();
  ar.mod();

  int a1,b1;
  System.out.println("enter a no.");
  a1=sc.nextInt();
  sc.nextLine();
  System.out.println("enter a no.");
  b1=sc.nextInt();
  lo.logicaland();
  lo.logicalor();
  lo.setData(a1,b1);

  int a2,b2;
  System.out.println("enter a no.");
  a2=sc.nextInt();
  sc.nextLine();
  System.out.println("enter a no.");
  b2=sc.nextInt();
  bt.setData(a2,b2);
  bt.bitwiseand();
  bt.bitwiseor();
  bt.bitwiseexclusiveor();
  bt.bitwiseleftshift();
  bt.bitwiserightshift();
 }
}