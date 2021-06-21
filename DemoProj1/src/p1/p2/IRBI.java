package p1.p2;

public interface IRBI {

	public double rateOfInterest();
	public default void panNumber(String pan_number)
	{
		System.out.println("You Pan :"+pan_number);
	}
	
	public static void main(String[] args) {
		System.out.println("main() method inside interface IRBI ..............");
	}
	
}
