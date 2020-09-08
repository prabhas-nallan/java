import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student number");
        int num=sc.nextInt();
        System.out.println("Enter the student name");
        sc.nextLine();
        String name=sc.nextLine();
        Student s1=new Student(num, name);
        s1.display();
        sc.close();
    }
    
}