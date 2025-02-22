package importantHandsOnForInterview;

public class RunTimePloymorphism {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.behav1();
        p.behav2();


        Parent c = new Child();
        c.behav1();
        c.behav2();
        //c.behav3();

       Child ch = new Child();
       ch.behav1();
       ch.behav2();
       ch.behav3();



    }
}

class Parent{

    public void behav1(){
        System.out.println("parent showing 1");
    }
    public void behav2(){
        System.out.println("parent showing 2");
    }


}

class Child extends Parent{
    @Override
    public void behav1(){
        System.out.println("child showing 1");
    }

    public void behav3(){
        System.out.println("child behave 3");
    }
//    public void behav2(){
//        System.out.println("child showing 2");
//    }

}
