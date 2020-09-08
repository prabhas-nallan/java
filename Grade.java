import java.util.Scanner;
class Grade
{
 public static void main(String args[])
 {
 int n;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the marks: ");
 n=sc.nextInt();
 if(n==100)
 {
	System.out.println("Grade S");
 }
 else if((n>89)&&(n<100))
 {
	System.out.println("Grade A+");
 }
 else if((n>79)&&(n<90))
 {
	System.out.println("Grade A");
 }
 else if((n>69)&&(n<80))
 {
	System.out.println("Grade B+");
 }
 else if((n>59)&&(n<70))
 {
	System.out.println("Grade B");
 }
 else if((n>49)&&(n<60))
 {
	System.out.println("Grade C+");
 }
 else if((n>39)&&(n<50))
 {
	System.out.println("Grade C");
 }
 else if(n<40)
 {
	System.out.println("fail");
 }
 else
 {
	System.out.println("invalid input");
 }
 }
}