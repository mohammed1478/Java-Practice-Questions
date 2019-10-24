package Lab7Classes;
import java.lang.Object;
public class Meal {
    private String appetizer,entree,side,drink,dessert;
    private double price;

    public Meal(String appetizer, String entree, String side, String drink, String dessert, double price){
        this.appetizer = appetizer;
        this.entree = entree;
        this.side = side;
        this.drink = drink;
        this.dessert = dessert;
        this.price = price;
    }
    public Meal(){
        price = 0.00;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public String getEntree() {
        return entree;
    }

    public String getSide() {
        return side;
    }

    public String getDrink() {
        return drink;
    }

    public String getDessert() {
        return dessert;
    }

    public double getPrice() {
        return price;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    public void setEntree(String entree) {
        this.entree = entree;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  String tostring(){
        String mealPackage = "Appetizer : " + getAppetizer() + ", Entree : " + getEntree() + ", Side : " + getSide() + ", Drink : " + getDrink() + ", Dessert:" + getDessert();

        return  mealPackage;
    }


}
