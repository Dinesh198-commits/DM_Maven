package interviewUnseen;

public class Abstraction_Main extends Abstraction_Base {

    public void display(){
        System.out.println("Dinesh Kumar");
    }

    public static void main(String [] args){
        Abstraction_Base nu = new Abstraction_Main();
       nu.display();
    }


}
