import java.util.Random;

public class Player {
    private static Random rand;
    private String name;
    private int turn;
    private int[] card;
    private int total;


    //A constructor method that takes a String “name” as a parameter, sets “turn” to 0, and
    //initializes the “card” array with a capacity of 21
    public Player(String name){
        this.name = name;
        this.turn = 0;
        card = new int [21];
    }

    public Player(){
        this("Default name");
        this.turn = 0;
        card = new int [21];
    }


    public static Random getRand() {
        return rand;
    }

    public String getName() {
        return name;
    }

    public int getTurn() {
        return turn;
    }

    public int[] getCard() {
        return card;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void setCard(int[] card) {
        this.card = card;
    }

    //A getTotal() method that returns the total value of all the ints in the “card” array.
    public int getTotal(){
        total = 0;
        for(int i = 0; i < 21; i++){
            total += card[i];
        }
        return total;
    }

    //A didBust() method that returns a boolean value. If the total point value of all the cards is >
    //21, return true; otherwise return false.

    public boolean didBust(){
        if(total > 21) {return true;}
        return false;
    }
    /*
    A drawCard() method that does the following:
    1. chooses a random number between 1 and 10,
    2. prints it out
    3. adds it to the “card” array. Use the “turn” attribute to keep track of position in the array
    4. after adding a card, increment “turn”.
    5. Print out the new total score
    6. if the player busted, print “Bust!”
    */

    public void drawCard(){
        rand = new Random();
        int randomNumber = rand.nextInt(10)+1;
        System.out.println("Random card Generated is " + randomNumber);
        card[turn] = randomNumber;
        ++turn;
        System.out.println("Your current total score is " + getTotal());
        if(didBust()){
            System.out.println("BUST!");
        }
    }

    /*
    A play() method that is the game loop for the player. In this method:
    1. Print the name of the player to announce their turn has begun
    2. In a loop, ask the player if they want to draw another card (call the drawCard() method) or stop
    3. Continue looping until the player wishes to stop or they bust
    4. Print the final total score.
     */


}
