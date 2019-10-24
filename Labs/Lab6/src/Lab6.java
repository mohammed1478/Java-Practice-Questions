import static java.lang.Math.sqrt;
import java.util.Random;
public class Lab6 {
    public static void main(String[] args){
        String[] a = {"sdjbhf","hi","hello","array","elemts","xyz","stuff","didmff"};
        System.out.println(findHypotenuse(4,6));
        System.out.println(random(a));
    }

    public static double findHypotenuse(double a, double b){
        return sqrt((a*a) + (b*b));
    }

    public static String random(String[] input){
        Random rand = new Random();
        int element = rand.nextInt(input.length);
        return input[element];
    }
    

}
