public class Constable extends Character{

    boolean jurisdiction;

    public Constable(String name){
        super(name,60,60,20,5);
        this.jurisdiction = true;
    }

    public void arrestCharacter(Character c){
        c.setArrested(true);
    }


    public boolean isJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(boolean jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
}
