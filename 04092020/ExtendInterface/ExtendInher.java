interface A
{
	void meth1();
	void meth2();
}

interface B extends A
{
	void meth3();
}
class C implements B
{
	public void meth1(){
		System.out.println("using meth1 : Prabhas");
	}
	public void meth2(){
		System.out.println("using meth2 : Raj");
	}
	public void meth3(){
		System.out.println("using meth3 : CSEA");
	}
}
class ExtendInher
{
	public static void main(String[] args){
		C obj=new C();
		obj.meth1();
		obj.meth2();
		obj.meth3();
	}
}
	