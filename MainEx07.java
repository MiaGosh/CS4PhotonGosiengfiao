package exercise07photongosiengfiaoamelia;

public class MainEx07 {
	public static void main(String[] args) { 
		Trainer t1 = new Trainer("Mia");
		WaterType m1 = new WaterType("Lapras", 1000, 100);
		NPC n1 = new NPC("Amelia");
		Location l1 = new Location("Pisay", "Fruit Shakes");
		
		t1.inspect(m1);
		t1.inspect(n1);
		t1.inspect(l1);
	}
}
