public class Child extends Parent{
    String message = "Child Message";


    public Child(){
        this("Child Message");
    }

    public Child(String message){
        this.message = message;
    }

    @Override
    public String printMessage(){
        return message;
    }
}
