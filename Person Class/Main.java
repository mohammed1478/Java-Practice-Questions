public class Main {
    public static void main(String[] args){

        Person person = new Person();

        person.setAge(19);
        person.setFirstName("jackie");
        person.setLastName("d");

        System.out.println("First Name = " + person.getFirstName() );
        System.out.println("Last Name = " + person.getLastName());
        System.out.println("Full Name = " +  person.getFullName());
        System.out.println("Age is = " + person.getAge());
        System.out.println("Is this person a teen? = " + person.isTeen());

    }
}
