package p1.p2;

public class AxisBank implements IRBI{
	
	@Override
	public double rateOfInterest() {
		// TODO Auto-generated method stub
		return 11.5;
	}
	
	public  void panNumber(String pan_number)
	{
		System.out.println("Axis Bank Class");
		System.out.println("You Pan :"+pan_number);
	}
	

}
