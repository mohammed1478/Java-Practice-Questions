public class Parent {

    String message;

    public Parent(){
        this("Parent Message");
    }

    public Parent(String message){
        this.message = message;
    }

    public String printMessage(){
        return message;
    }

    public boolean equals(Object obj){
        if(this == obj){ //if the two objects have the same memory address, they are the same
            return true;
        }else if(obj == null || this.getClass() != obj.getClass()){ // if passed in object is null or are different classes
            return false;
        }
        else {
            Parent ParentObj = (Parent) obj;
            return this.message.equalsIgnoreCase(ParentObj.message);
        }
    }
}
