package Polymorphism_2;

public class Machine {
	private float energy;
	private float remainingEnergy;
	public Machine(float energy, float remainingEnergy) {
		super();
		this.energy = energy;
		this.remainingEnergy = remainingEnergy;
	}
	float addEnergy(float energy) {
		
		energy=energy+remainingEnergy;
		
		return energy;
		
		
	}
	
	
	float runFan(float remainingEnergy) {
		
		return remainingEnergy;
		
		
	}
	

}
