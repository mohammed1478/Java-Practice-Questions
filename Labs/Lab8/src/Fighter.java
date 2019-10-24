import java.util.Random;

public class Fighter {
    private double health,damage, armour;
    private String name;
    static Random random = new Random();

    public Fighter(String name ,double health, double damage, double armour){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.armour = armour;
    }
    public Fighter(){
        this.name = "default name";
        this.health = 0.0;
        this.damage = 0.0;
        this.armour = 0.0;
    }

    public void setHealth(double health){
        this.health = health;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setArmour(double armour) {
        this.armour = armour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth(){
        return health;
    }
    public double getDamage(){
        return damage;
    }

    public double getArmour() {
        return armour;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name + "/ Health : " + health;
    }

    public void fight(Fighter opponent){
        System.out.println( name + " is now fighting " + opponent);
        int myFightersNumber = random.nextInt(100);
        int opponentsNumber = random.nextInt(100);
        if(opponentsNumber > myFightersNumber){ System.out.println("Attack Missed :( ");}

        double damageOfAttacker = random.nextInt((int)damage) - opponent.armour;
        if(damageOfAttacker < 0) {damageOfAttacker = 0;}
        System.out.println(name +" Dealing damage : " + damageOfAttacker + " damage");

        opponent.health -= damageOfAttacker;
        System.out.println(toString());
        System.out.println(opponent);

    }

}
