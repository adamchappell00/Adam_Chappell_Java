import java.util.Objects;

public abstract class Character {
        String name;
        int strength;
        int health;
        int stamina;
        int speed;
        int attackPower;
        boolean running;
        boolean arrested;

        public Character(){}

        public Character(String name, int strength, int stamina, int speed, int attackPower) {
                this.name = name;
                this.strength = strength;
                this.health = 100;
                this.stamina = stamina;
                this.speed = speed;
                this.attackPower = attackPower;
                this.running = false;
                this.arrested = false;
        }

        public void attackCharacter(Character c){c.setHealth(c.getHealth() - this.attackPower);}

        public String getName() {return name;}
        public void setName(String name) {this.name = name;}

        public int getStrength() {return strength;}
        public void setStrength(int strength) {this.strength = strength;}

        public int getHealth() {return health;}
        public void setHealth(int health) {this.health = health;}

        public int getStamina() {return stamina;}
        public void setStamina(int stamina) {this.stamina = stamina;}

        public int getSpeed() {return speed;}
        public void setSpeed(int speed) {this.speed = speed;}

        public int getAttackPower() {return attackPower;}
        public void setAttackPower(int attackPower) {this.attackPower = attackPower;}

        public boolean isRunning() {return running;}
        public void setRunning(boolean running) {this.running = running;}

        public boolean isArrested() {return arrested;}
        public void setArrested(boolean arrested) {this.arrested = arrested;}


}
