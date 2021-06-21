package p1.p2;

public class Car{
	
	
	
	public static void main(String[] args) {
		
		Vehicle c=new Vehicle()
				{
			@Override
			public int noOfWheels() {
				// TODO Auto-generated method stub
				return 4;
			}
				};
		
		int now=c.noOfWheels();
		
		System.out.println("No of wheels for car:"+now);
	}

}
