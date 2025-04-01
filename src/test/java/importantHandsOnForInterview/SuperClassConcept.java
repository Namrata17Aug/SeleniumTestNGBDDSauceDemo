package importantHandsOnForInterview;

public class SuperClassConcept {
    public static void main(String[] args) {
        Car c = new Car();
        //c.displayspeed();
        //c.displayMessage();
        System.out.println(c.maxSpeed);
        c.message();
        c.namrataMethod();

    }

}

class Vehicle{

    Vehicle(){
        System.out.println("parent class constructor");
    }
    int maxSpeed = 20;

    public void message(){
        System.out.println("this is vehicle messg");
    }
    public void namrataMethod(){
        System.out.println("parent namrata");
    }
}

class Car extends Vehicle{
    Car(){
        super();
        System.out.println("Child class constructor");
    }
    //int maxSpeed = 180;

//    public void displayspeed(){
//        System.out.println("max speed is " +super.maxSpeed);
//    }

//    public void message(){
//        System.out.println("this is car messg");
//    }

//    public void displayMessage(){
//        message();
//        super.message();
//        super.namrataMethod();
//    }
}
