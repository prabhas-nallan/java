import java.util.Scanner;
public class ShapeMain2 {
    public static void main(String[] args) {
        int dimension1,dimension2,dimension3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension 1 2 3");
        dimension1=sc.nextInt();
        dimension2=sc.nextInt();
        dimension3=sc.nextInt();
        RectanglePrizm r2=new RectanglePrizm(dimension1, dimension2, dimension3);
        System.out.println("The surface area of the Rectanglr Prizm is " + r2.computeprizmArea());
        System.out.println("The volume of the Rectangle Prizm is " + r2.computeVolume());
        sc.close();
    }
    
}