import java.util.Scanner;
public class ShapeMain {
    public static void main(String[] args) {
        int dimension1,dimension2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the dimension1");
        dimension1=sc.nextInt();
        System.out.println("Enter the dimension2");
        dimension2=sc.nextInt();
        Rectangle r1=new Rectangle(dimension1, dimension2);
        System.out.println("The area of the rectangle is " + r1.computeArea());
        System.out.println("The perimeter of the rectangle is " + r1.computePeri());
        sc.close();
    }
    
}