import java.util.Stack;



public class Main {
    public static void main(String[] args){
        reverse("Reversed String"); //returns "gnirtS desreveR"
    }

    public static void reverse (String word){
        Stack<Character> myStack = new Stack<Character>();

        for(int i = 0; i < word.length(); i++){
            myStack.push(word.charAt(i));
        }

        for(int j = 0; j < word.length();j++){
            System.out.print(myStack.pop());
        }
    }

}
