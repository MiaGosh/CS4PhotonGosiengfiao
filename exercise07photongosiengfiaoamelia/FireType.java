package exercise07photongosiengfiaoamelia;

public class FireType extends Monster {
    public FireType(String n, int m, int base){
        super(n, "Fire", "Grass", "Water", m, base);
        atk = 1.3*base;
        def=0.7*base;
        monsterList.add(this);
        
        System.out.printf("Congratulations! You just adopted a Fire type pokemon! The following are the stats:%n%s%nMax HP: %.2f %nAttack: %.2f%nDefense: %.2f%n%n", this.getName(), this.getMaxHP(), this.getAtk(), this.getDef());
    }
    
    @Override
    public void special(){
        int changeatk = 2;
        double changehp = maxHP*0.1;
        this.atk += changeatk;
        this.hp -= changehp;
        
        System.out.printf("%n%s used its special and increased its attack by %d but lost %.2f amount of health! %nHealth remaining: %.2f %nAttack: %.2f%n", this.getName(), changeatk, changehp, this.getHP(), this.getAtk());
    }
}
