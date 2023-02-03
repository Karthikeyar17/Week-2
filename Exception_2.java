package Week_2;
class ICCE extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7350125690394125013L;

	public ICCE(String message) {
		super(message);
}	
}
class IDE extends Exception{
		/**
	 * 
	 */
	private static final long serialVersionUID = 8708227578945531212L;

		public IDE(String message) {
			super(message);
}
	}
	class ITPE extends Exception{
			/**
		 * 
		 */
		private static final long serialVersionUID = -6753692422810974287L;

			public ITPE(String message) {
				super(message);
}
}
	
class BusBooking{
	private int bookingId;
	private String destination;
	private String tripPackage;
	private double totalAmount;
	public BusBooking(int bookingId, String destination, String tripPackage) {
		this.bookingId = bookingId;
		this.destination = destination;
		this.tripPackage = tripPackage;
		this.totalAmount = 0;
		
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTripPackage() {
		return tripPackage;
	}
	public void setTripPackage(String tripPackage) {
		this.tripPackage = tripPackage;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public boolean validateCouponCode(String couponCode, int numberofMembers) throws ICCE{
		if((couponCode.equals("BIGBUS") && numberofMembers>=10)||
				(couponCode.equals("MAGICBUS")&& numberofMembers>=15))
			return true;
		else throw new ICCE("Invalid coupon code");
		
	}
	public String bookTrip( String couponCode,int numberofMembers) {
	try {
		if(!(this.destination.equals("WashingtonDC")||
			this.destination.equals("Philadelphia")||
			this.destination.equals("Orlando")||
			this.destination.equals("Boston")||
			this.destination.equals("Atlanta")))
			throw  new IDE("Invalid Destination");
		else if(!(this.tripPackage.equals("Regular")||
				this.tripPackage.equals("Premium")))
			throw new ITPE("Invalid Package");
		validateCouponCode(couponCode,numberofMembers);
		if(tripPackage.equals("Regular")) {
			setTotalAmount(500*numberofMembers);
			return "Booking Successful";
			
		}
		else if(tripPackage.equals("Premium")) {
			setTotalAmount(800*numberofMembers);
			return "Booking Successful";
				
		}	
		else throw new ITPE("Invalid Package");
		
	}
	catch(ITPE | IDE | ICCE e) {
		return e.getMessage();
		
	}
	}

}


	class Exception_2{
	 public static void main(String[] args) {
	BusBooking booking = new BusBooking(101,"Orlando", "Regular");
	String result = booking.bookTrip("BIGBUS", 11);
	if(result.equals("Booking successful")){
	System.out.println(result);
	System.out.println("Total amount for the trip: " + booking.getTotalAmount());
	}
	else{
	System.out.println(result);
	System.out.println("Your booking was not successful, please try again!");
	}
	}
	}
