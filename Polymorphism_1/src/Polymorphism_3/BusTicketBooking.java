package Polymorphism_3;

public class BusTicketBooking {
	private String passengerName;
	private String emailID;
	private int mobileNo;
	private String dateOfTravel;
	boolean isAC;
	boolean isWifi;
	boolean isSleeper;


	public BusTicketBooking(int numOfPassengers, float price, boolean isAC, boolean isWifi, boolean isSleeper,
			float price2, int numOfChildren) {
		super();
		this.passengerName=passengerName;
		this.emailID=emailID;
		this.mobileNo=mobileNo;
		this.dateOfTravel=dateOfTravel;
		this.isAC=isAC;
		this.isWifi=isWifi;
		this.isSleeper=isSleeper;
		}
	public void bookTicket(int numOfPassengers, float price) {
	if(isAC)
		System.out.println("Amount : "+((float)numOfPassengers*price)+(float)250);
	if(isSleeper)
		System.out.println("Amount : "+(numOfPassengers*price)+350);
	if(isWifi)
		System.out.println("Amount : "+(numOfPassengers*price)+250);
	else
		System.out.println("Amount : "+(numOfPassengers*price));
		
	}

	

}
