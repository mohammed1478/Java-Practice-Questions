

public class BankAccount {
    private double balance;
    private String accountNum;
    private String customerName;
    private String email;
    private String phoneNum;
    
    
    public BankAccount(){
        System.out.println("Welcome to your Bank Account");
        balance = 1000.00
    }
    

    //_______________________________ GETTER / SETTER _______________________________________//

    public void setBalance(double balance){
        this.balance = balance;

    }

    public double getBalance(){
        return balance;
    }

    public void setAccountNum(String accountNum){
        this.accountNum = accountNum;
    }

    public String getAccountNum(){
        return accountNum;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    //___________________________________METHODS_____________________________//

    public void deposit (double amount ){
        System.out.println("your previous balance before deposit was " + balance);
        balance+=amount;
        System.out.println("your current balance is " + balance);
    }

    public void withdraw(double amount){
        if(balance < amount ){
            System.out.println("Insufficient finds. Cannot Withdraw");
        }

        if(balance > amount) {
            System.out.println("your previous balance before withdraw was " + balance);
            balance -= amount;
            System.out.println("your current balance is " + balance);
        }
    }




}
