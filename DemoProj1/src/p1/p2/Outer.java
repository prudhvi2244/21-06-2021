package p1.p2;

public class Outer {

	
	public static void main(String[] args) {
		
		AbstractDemo1 obj=new AbstractDemo1()
				{
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
				};
		
				int addResult=obj.add(10,90);
				System.out.println("Addition :"+addResult);
	}

}
