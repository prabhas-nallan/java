class bitwise
{
	 int a,b;
 	 void setData(int x,int y)
 	 {
 	  a=x;
	  b=y;
	 }
	 void bitwiseor()
	 {
	  int result1=a/b;
 	  System.out.println("bitwise or of 2 no.s=	"+result1);
	 }
	 void bitwiseand()
	 {
	  int result2=a&b;
	  System.out.println("bitwise and of 2 no.s=	"+result2);
	 }
	 void bitwiseexclusiveor()
	 {
	  int result3=a^b;
	  System.out.println("bitwise exclusiveor of 2 no.s=	"+result3);
	 }
	 void bitwiseleftshift()
	 {
	  int result4=a<<b;
	  System.out.println("bitwise leftshift of 2 no.s=	"+result4);
	 }
	 void bitwiserightshift()
	 {
	  int result5=a>>b;
	  System.out.println("bitwise rightshift of 2 no.s=	"+result5);
	 }
}

