package mmrBOOST;
import java.util.ArrayList;

public class Agency {
	private String name;
	private double funds;
	private Manager manager; //how to do only manager in use per agency (?)
	
	
	public Agency (String name) {
		this.name=name;
		funds=100000;
	}
	
	public String getName() {
		return name;
	}
	
	public double getFunds() {
		return funds;
	}
	
}
