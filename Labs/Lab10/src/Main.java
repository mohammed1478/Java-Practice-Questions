public class Main {
    public static void main(String[] args){
        //Player myPlayer = new Player();
        Warrior myCharacter = new Warrior("big boi",5);
        System.out.println(myCharacter.toString());
        myCharacter.smitePlayer();
    }
}
