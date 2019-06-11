public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer(){
        name = "default Name";
        creditLimit = 0;
        email = "name@email.com";
    }

    public Customer(String name, String email){
        this(name,email,500);
    }

    public Customer(String name, String email, double creditLimit ){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    //________________________________ Getters_____________________//

    public String getName(){
        return name;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public  String getEmail(){
        return email;
    }
}
