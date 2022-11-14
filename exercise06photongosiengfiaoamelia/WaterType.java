package exercise06photongosiengfiaoamelia;

public class WaterType extends Monster {
	public WaterType(String n, int m, int base){
        super(n, "Water", "Fire", "Grass", m, base);
        atk = 0.7*base;
        def=1.3*base;
        monsterList.add(this);
        
        System.out.printf("Congratulations! You just adopted a Water type pokemon! The following are the stats:%n %s%n Max HP: %.2f %n Attack: %.2f%n Defense: %.2f%n%n", this.getName(), this.getMaxHP(), this.getAtk(), this.getDef());
    }
    
	@Override
    public void special(){
        int changedef = 2;
        double changehp = maxHP*0.1;
        this.def += changedef;
        this.hp -= changehp;
        
        System.out.printf("%n%s increased its defense by %d but lost %.2f amount of health! %nHealth remaining: %.2f %nDefense: %.2f%n%n", this.getName(), changedef, changehp, this.getHP(), this.getAtk());
    }
}
