package Polymorphism_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String passengerName;
		String emailID;
		int  mobileNo;
		String dateOfTravel;
		int numOfPassengers;  
        float price;
        boolean isAC;
        boolean isWifi;
        boolean isSleeper;
        int numOfChildren;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Passengers Name :");
        passengerName=sc.next();
        System.out.println("Enter email-Id :");
        emailID=sc.next();
        System.out.println("Enter mobile no : ");
        mobileNo=sc.nextInt();
        System.out.println("Enter date of travel : ");
        dateOfTravel=sc.next();
        System.out.println("Enter number of passengers : ");
        numOfPassengers=sc.nextInt();
        System.out.println("Enter price : ");
        price=sc.nextFloat();
        System.out.println("Has Ac?");
        isAC=sc.nextBoolean();
        System.out.println("Has Wifi?");
        isWifi=sc.nextBoolean();
        System.out.println("Has Sleeper?");
        isSleeper=sc.nextBoolean();
        System.out.println("Enter the number of children :");
        numOfChildren=sc.nextInt();
        BusTicketBooking b=new BusTicketBooking(numOfPassengers,price,isAC,isWifi,isSleeper,price,numOfChildren);
        b.bookTicket(numOfPassengers,price);
	}

}
