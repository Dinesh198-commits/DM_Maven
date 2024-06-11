package interviewUnseen;

public class Polymorphism_overriding_main extends Polymorphism_overriding_base{

    public void display(){
        System.out.println("This is my class");
        super.display();
    }
    public static void main(String [] args){

        Polymorphism_overriding_main ps = new Polymorphism_overriding_main();
        ps.display();
    }
}
