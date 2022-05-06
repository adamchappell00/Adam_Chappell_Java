public class Farmer extends Character{

    boolean plowing;
    boolean harvesting;

    public Farmer(String name){
        super(name, 75, 75, 10, 1);
        this.plowing = false;
        this.harvesting = false;
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }
}