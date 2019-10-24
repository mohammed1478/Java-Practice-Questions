//this class is from lab 9
public class Player {
    private int level,strength, speed, stamina;
    private String name;

    public Player(){
        this("Default Name",1,10,10,10);
    }
    public Player(String name){
        this.name = name;
    }

    public Player(String name , int level, int strength, int speed, int stamina){
        this.level = level;
        this.name = name;
        if ((strength + speed + stamina) <= 30 ) {
            this.strength = strength;
            this.speed = speed;
            this.stamina = stamina;
        }else {
            System.out.println("Strength , speed and stamina must add up to 30");
        }

    }

    public int getLevel() {
        return level;
    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name : " + name + " level : " + level + " strength : " + strength + " speed : " + speed + " stamina : "+ stamina ;
    }





}
