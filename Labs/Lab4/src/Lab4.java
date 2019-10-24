import java.util.Scanner;
public class Lab4 {

    public static void main(String[] args){
        // ============== VARIABLE PRACTICE ===========================
        Scanner input = new Scanner(System.in);
        int timesCommuted = 10;
        double hoursOfCommute = 0.66;
        boolean amHappyToBeLearningJava = true;
        char letterGrade = 'A';
        String favoriteColor = "blue";
        String favoriteFood = "chicken breast";
        String favoriteVacation = "No days off";

        // ================== Array Practice ==========================

        double[] score = new double[3];

      /*  System.out.println("Rate your past 3 days");
        for(int i = 0; i < 3 ; i++){

            System.out.println("Day" + (i + 1) +": ");
            score[i] = input.nextDouble();
        }

       */

        String[] ingredient = {"chicken"};

        double weeklyCommuteTime = timesCommuted * hoursOfCommute;
        System.out.println("Your Weekly commute time is " + weeklyCommuteTime);

        // +++++++++++++ While loop practice +++++++++++++++++++//

        int birthYear = 2000, counter = 0;

        while (birthYear != 0){
            birthYear/=2;
            System.out.println("birth year " + birthYear);
            ++counter;
            System.out.println("Number of times loop ran : " + counter + " \n_____________________ ");
        }
        echo("my word", 5);
        System.out.println( isEven(2) );
        System.out.println( isEven(3) );

        for(int i = 1; i <= 10; i++ ){
            System.out.println("" + i + " is prime? : " + isPrime(i));
        }
       /* for(int i = -10; i <= 0 ;i++ ){
            System.out.println("" + i + " is prime? : " + isPrime(i));
        }
        */


        System.out.println("Factorial");
        System.out.println(factorial(15));

        System.out.println("String duplicates");
        String[] n = {"my", "ug", "is", "my", "ugly"};
        String[] q = {"my", "dog", "is", "ugly", "jk"};
        System.out.println(hasDuplicates(n));
        System.out.println(hasDuplicates(q));


    }
    // =================================== METHOD PRACTICE ===================================//

    public static void echo(String word, int timesRepeated){
        for(int i = 0; i < timesRepeated ; i++){
            System.out.println(word);
        }
    }

    public static boolean isEven(int x){
        if(x%2 == 0) {
            return true;
        }
        else return  false;
    }

    public static boolean isPrime(int x) {
        if(x > 0) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) return false;
            }
        } else if (x < 0) {
            for(int j = x + 1; j <= 0 ; j++){
                if( x % j == 0) return false;
            }
        }
        return true;
    }

    public static int factorial(int num){
        if(num == 1) return 1;
        return factorial(num-1) * num;
    }

    public static boolean hasDuplicates(String[] x) {
        for (int j = 0; j < x.length; j++) {
            for (int i = j+1; i < x.length; i++) {
                if (x[j].equals(x[i])) return true;
            }
        }
        return false;
    }

}


