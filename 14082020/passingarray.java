import java.util.*;

class passingarray{
  void a() {
    int b[]={1,2,3,4,5,6,7};
    c(b);
  }

 void c(int b[]) {
 for(int i=0;i<b.length;i++) {
      System.out.print(b[i]+" ");
    }
  }

 public static void main(String args[]) {
    passingarray p1=new passingarray();
    p1.a();
  }
}