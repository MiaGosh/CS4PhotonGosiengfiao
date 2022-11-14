package exercise06photongosiengfiaoamelia;

public class MainEx06 {
	public static void main(String[] args) { 
		FireType ft1 = new FireType("Arcanine", 1000, 100);
		GrassType gt1 = new GrassType("Tsareena", 1000, 100);
		WaterType wt1 = new WaterType("Lapras", 1000, 100);
		boolean undefeated = true;
		
		System.out.printf("%n%s will be fighting against %s. Let's see who will win!%n", ft1.getName(), gt1.getName());
		
		ft1.special();
		gt1.special();
		do {
			if (ft1.getHP()<=0 || gt1.getHP()<=0) {
				undefeated = false;
				ft1.restoreHealth();
				gt1.restoreHealth();
				break;
			}
			
			gt1.attack(ft1);
			ft1.attack(gt1);
		} while (undefeated);
		
		System.out.printf("%n%n%s will be fighting against %s. Let's see who will win!%n", ft1.getName(), wt1.getName());
		undefeated = true;
		
		ft1.special();
		wt1.special();
		do {
			if (ft1.getHP()<=0 || wt1.getHP()<=0) {
				undefeated = false;
				ft1.restoreHealth();
				wt1.restoreHealth();
				 if (ft1.getHP()<=0) {
					 
				 } else if (wt1.getHP()<=0) {
					 
				 }
				 
				break;
			}
				
			ft1.attack(wt1);
			wt1.attack(ft1);
			
		} while (undefeated);
		
		System.out.printf("%n%n%s will be fighting against %s. Let's see who will win!%n", gt1.getName(), wt1.getName());
		undefeated = true;
		
		wt1.special();
		gt1.special();
		do {
			if (wt1.getHP()<=0 || gt1.getHP()<=0) {
				undefeated = false;
				wt1.restoreHealth();
				gt1.restoreHealth();
				break;
			}
			
			wt1.attack(gt1);
			gt1.attack(wt1);
			
		} while (undefeated);
		
	}
}
