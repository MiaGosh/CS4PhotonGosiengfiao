package exercise07photongosiengfiaoamelia;

public class GrassType extends Monster {
	public GrassType(String n, int m, int base){
        super(n, "Grass", "Water", "Fire", m, base);
        atk = base;
        def= base;
        monsterList.add(this);
        
        System.out.printf("Congratulations! You just adopted a Grass type pokemon! The following are the stats:%n%s%nMax HP: %.2f %nAttack: %.2f%nDefense: %.2f%n%n", this.getName(), this.getMaxHP(), this.getAtk(), this.getDef());
    }
    
	@Override
    public void special() {
        double changehp = maxHP*0.2;
        this.hp += changehp;
        
        System.out.printf("%s used its special and increased its health by %.2f! %nTotal health: %.2f%n%n", this.getName(), changehp, this.getHP());
    }

    public void rest(){
       double halfmax=maxHP*0.5;
       this.hp += halfmax;
       
       System.out.printf("%n%s rested! Health increased by %.2f. Total health: %.2f%n%n", this.getName(), halfmax, this.hp);
    }
}
