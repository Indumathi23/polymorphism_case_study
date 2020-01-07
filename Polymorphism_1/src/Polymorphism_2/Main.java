package Polymorphism_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float energyReserve;
		float energy;            
        float remainingEnergy;
        float jumpHeight;
        int distanceStrolled;
        String soundsMade ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the energy reserve : ");
		energyReserve=sc.nextFloat();
		System.out.println("Enter the total enegy : ");
		energy=sc.nextFloat();
		System.out.println("Enter the jump Height : ");
		jumpHeight=sc.nextFloat();
		System.out.println("Enter the distanceStrolled :");
		distanceStrolled=sc.nextInt();
		System.out.println("Enter the sounds made :");
		soundsMade=sc.next();
		remainingEnergy=energy-energyReserve;
		Machine m=new Machine(energy,remainingEnergy);
		System.out.println("Energy added : "+m.addEnergy(energy)+" joules");
		System.out.println("Fan running at :"+m.runFan(remainingEnergy)+" joules");
		Cat c=new Cat(jumpHeight,distanceStrolled,soundsMade);
		System.out.println("Energy generated for jumped height "+c.generateEnergy(jumpHeight)+" joules");
		System.out.println("Energy generated for distance strolled "+c.generateEnergy(distanceStrolled)+" joules");
		System.out.println("Energy generated for sounds made "+c.generateEnergy(soundsMade)+" joules");
	}

}
