public class ConfigMain {
    public static void main(String[] args) {
        Triangle t1=new Triangle(6,7,8);
        System.out.println(t1.computeArea());
        System.out.println(t1.computePeri());
        Rectangle2 r1=new Rectangle2(10, 50);
        System.out.println(r1.computeArea());
        System.out.println(r1.computePeri());
    }
    
}