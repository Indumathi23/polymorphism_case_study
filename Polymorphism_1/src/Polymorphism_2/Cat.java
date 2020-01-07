package Polymorphism_2;

public class Cat {
	private float jumpHeight;
	private int distanceStrolled;
	private String soundsMade;
	public Cat(float jumpHeight, int distanceStrolled, String soundsMade) {
		super();
		this.jumpHeight=jumpHeight;
		this.distanceStrolled=distanceStrolled;
		this.soundsMade=soundsMade;
		
	}

	float generateEnergy(float jumpHeight) {
		float n=(float) (jumpHeight/10.75);
		return (float) (n*7.2);
		
	}
	float generateEnergy(int distanceStrolled) {
		float n=(float)distanceStrolled/172;
		return (float) (12.75*n);
		
	}

	float generateEnergy(String soundsMade) {
		int n=0,i;
		for(i=0;i<soundsMade.length();i++)
		{
			soundsMade.split(" ",4);
			n++;
		}
		
		n=n/5;
		
		return (n*100);
		
		
	}

}
