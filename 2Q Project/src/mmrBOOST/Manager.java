package mmrBOOST;
import java.util.ArrayList;

public class Manager {
	private String name;
	private double maxEnergy;
	private double energy;
	
	public Manager(String name) {
		this.name=name;
		maxEnergy=1000;
		energy=1000;
	}
	
	public void sleep() {
		energy=maxEnergy;
	}
	
	//need to figure out how to integrate time into project
	public void nap(int length) { //length in mins ++ make sure there are choices of 10, 30, and 60 
		energy+=(maxEnergy*(length/200)); //each min will replenish 1/200 of ur max energy
	}

}
