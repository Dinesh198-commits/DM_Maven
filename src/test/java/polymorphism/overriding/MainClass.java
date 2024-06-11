package polymorphism.overriding;

public class MainClass extends BaseClass{

    public void sing(){

        super.sing();
        System.out.println("Dinesh is Singing");
    }

    public static void main(String args[]){

        BaseClass bc = new MainClass();
        bc.sing();
    }
}
