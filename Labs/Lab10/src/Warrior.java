public class Warrior extends Player {
    private int smite;

    public Warrior(String name, int smite){
        super(name, 1,5,10,10);
        this.smite = smite;
    }

    public Warrior(){
        this("Default name", 0);
    }

    public int getMagic(){
        return this.smite;
    }

    public void setMagic(int smite ){
        this.smite = smite;
    }

    public void smitePlayer(){
        System.out.println("Your warrior " + getName() + " just smote the enemy");
    }




    public String toString(){
        return "Name : " + getName() + " level : " + getLevel() + " strength : " + getStrength() + " speed : " + getSpeed() + " stamina : "+ getStamina() ;
    }
}
