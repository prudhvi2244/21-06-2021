package p1.p2;

public class Demo1 implements IDemo,I1 {

	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a,int b )
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	public double div(int a,int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		
		Demo1 obj=new Demo1();
	    int addResult=obj.add(10,90);
		int subResult=obj.sub(90,10);
		int muResult=obj.mul(10,50);
		double divResult=obj.div(10,2);
		
		System.out.println("Addition :"+addResult);
		System.out.println("Substraction :"+subResult);
		System.out.println("Multiplication :"+muResult);
		System.out.println("Division :"+divResult);
	}

}
