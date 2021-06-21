package p1.p2;

public class ChildClass extends AbstractDemo{

	static
	{
		System.out.println("static block inside child class");
	}
	public ChildClass()
	{
		System.out.println("ChildClass constructor");
	}
	 
	
	public int add(int a, int b) {
		return a+b;
	}
	
	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	public static void main(String[] args) {
		
		ChildClass c1=new ChildClass();
		int addResult=c1.add(10,10);
		int mulResult=c1.mul(20,20);
		System.out.println("Addition :"+addResult);
		System.out.println("Multiplication :"+mulResult);
	}
	
}
