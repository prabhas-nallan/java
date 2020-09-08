public class DMD {
    public static void main(String[] args) {
        Config cf;
        cf=new Triangle(6, 7, 8);
        System.out.println(((Triangle) cf).computeArea());
        System.out.println(((Triangle) cf).computePeri());
        cf=new Rectangle2(10, 20);
        System.out.println(((Rectangle2) cf).computeArea());
        System.out.println(((Rectangle2) cf).computePeri());
        
    }
    
}