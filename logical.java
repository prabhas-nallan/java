class logical
{
	boolean result;
	int a,b;
 	void setData(int x,int y)
	{
 	 a=x;
 	 b=y;
 	}
 	void logicaland()
 	{
 	 result=(a>b)&&(a<b);
 	 System.out.println("using and operator	"+result);
	}
 	void logicalor()
 	{
 	 result=(a>b)||(a<b);
 	 System.out.println("using or operator	"+result);
	}
}