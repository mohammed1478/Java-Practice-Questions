

public class Main {
    public static void main(String[] args){

        Customer customer = new Customer();

        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());
        System.out.println(customer.getName());
        System.out.println(" ");

        Customer mo = new Customer("mo","mo@gmail.com");
        System.out.println(mo.getCreditLimit());
        System.out.println(mo.getEmail());
        System.out.println(mo.getName());
        System.out.println(" ");

        Customer VIP = new Customer("Bezos", "jeff@amazon.com", 1000000000);
        System.out.println(VIP.getCreditLimit());
        System.out.println(VIP.getEmail());
        System.out.println(VIP.getName());
        System.out.println(" ");
    }
}
