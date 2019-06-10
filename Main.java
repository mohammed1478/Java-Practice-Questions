import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String firstName;
        String accountNumber;
        String phoneNumber;
        int decision= 0;
        double withdraw;
        double deposit;
        boolean moveOn = false;

        BankAccount customer = new BankAccount();

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name");
        firstName = input.next();

        customer.setCustomerName(firstName);

        System.out.println("What is your Account Number?");
        accountNumber = input.next();

        customer.setAccountNum(accountNumber);

        System.out.println("Enter Your Phone #");
        phoneNumber = input.next();

        customer.setPhoneNum(phoneNumber);


        while(!moveOn){
            System.out.println("Would you like to deposit or withdraw? SELECT 1 FOR WITHDRAW, 2 FOR DEPOSIT");
            decision = input.nextInt();
            if (decision == 1 || decision == 2 ) moveOn = true;
        }

        if(decision == 1) {
            System.out.println("How much would you like to withdraw?");
            withdraw = input.nextDouble();
            customer.withdraw(withdraw);
        }
        else if (decision == 2){
            System.out.println("How much would you like to deposit?");
            deposit = input.nextInt();
            customer.deposit(deposit);
        }

        System.out.println(" ");
        System.out.println("Name : " + customer.getCustomerName());
        System.out.println("Account number : "+ customer.getAccountNum());
        System.out.println("Phone # " + customer.getPhoneNum());
        System.out.println("your balance " + customer.getBalance());





    }
}
