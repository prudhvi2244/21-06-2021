package p1.p2;

abstract public class AbstractDemo {
	
	public AbstractDemo() {
		System.out.println("AbstractDemo Constructor");
	}
	
	abstract public int add(int a,int b);
	abstract public int mul(int a,int b);
	
	int c=10;
	String name="RAJ";
	
	public static final String ACCNO="5555256363611";
	
	static
	{
		System.out.println("static block inside class AbstractDemo");
	}
	
	public static void main(String[] args) {
		System.out.println("main() method from abstract class");
	}
	


}
