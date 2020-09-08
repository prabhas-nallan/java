public class ConstrDemo
{
   int x=30;
  ConstrDemo()
  {
    System.out.println("Iam a default Constructor");
  }
  ConstrDemo(int x,int y)
  {
     System.out.println("Iam a parantherized Constr");
  }
  ConstrDemo(ConstrDemo cd)
  {
     System.out.println(cd.x);
     System.out.println("Iam a copy Constr");
  }
 
  public static void main(String args[])
  {
     ConstrDemo cd=new ConstrDemo();
      cd.ConstrDemo(4,5);
      new ConstrDemo(cd);
  }
}