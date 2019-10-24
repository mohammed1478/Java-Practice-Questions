public class Main {
    public static void main(String[] args){
        Parent parent1 = new Parent();
        Parent parent2 = new Parent("parent message");
        Parent parent3 = new Parent("New parent message");
        Child child1 = new Child();

        System.out.println(parent1.printMessage());//show message for parent 1
        System.out.println(child1.printMessage());//show message for child
        System.out.println(parent2.printMessage());//show message for parent 2
        System.out.println(parent3.printMessage());//show message for  parent 3
        System.out.println(parent1.equals(child1)); //see if parent1 object is equal to child object (false cuz two different class)
        System.out.println(parent1.equals(parent2));// see if parent1 object is equal to parent2 object (true cuz both object is "parent message")
        System.out.println(parent1.equals(parent3));//see if parent1 object is equal to parent3 object (false cuz one object is "parent message"
                                                    // and the other is "New parent object"



    }
}
