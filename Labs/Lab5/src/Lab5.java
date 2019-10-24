import java.util.Scanner;
public class Lab5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your Name?");
        String name = input.nextLine();
        System.out.println("hello " + name);
        System.out.println("Print \" my word \" line by line : ");
        printChars("myWord");
        System.out.println("Reverse the word \" Horse \" :");
        reverse("Horse");
        System.out.println("\nconvert any use of the word \" cat \" to \" dog \" : \n");

        dogify("i love cats");
        dogify("I will never own a cat :<");
        dogify("cat in Caps is CAT");
        dogify("cats in caps is CATS");
    }

    public static void printChars(String word){
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }

    public static void reverse(String word){
        System.out.println("The word \" "+ word + " \" reversed is :  ");
        for(int i = word.length() - 1 ; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }

    public static void dogify(String word){
        String newWord;
        if(word.contains("cats")) {
            newWord = word.replace("cats", "dogs");
        }
        else if (word.contains("cat")) {
            newWord = word.replace("cat", "dog");
        }
        else if(word.contains("CAT")) {
            newWord = word.replace("CAT","DOG");
        }
        else newWord = word.replace("CATS","DOGS");

        System.out.println(newWord);

    }


}
