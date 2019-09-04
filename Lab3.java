import java.util.Scanner;
public class Lab3 {

    public static void calculate(int[] a,int b) {
        int maxGains= 0;
        int currentGains = 0;
            for(int j = b ; j < a.length ; j++){
                currentGains += a[j];
                if(currentGains > maxGains){
                    maxGains = currentGains;
                }
                if(currentGains  < 0){
                    currentGains = 0;
                }
            }
        System.out.println(maxGains);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] gains = {10,7,-3,-10,4,2,8,-2,4,-5,-6};
        int days;
        System.out.println("Enter the number of days");
        days = input.nextInt();
        calculate(gains,days);
        }

}
