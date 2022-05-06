public class Warrior extends Character{

    int shieldStrength;

    public Warrior(String name){
        super(name, 75, 100, 50, 10);
        this.shieldStrength = 100;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
}