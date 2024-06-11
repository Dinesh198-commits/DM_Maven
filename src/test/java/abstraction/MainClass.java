package abstraction;

public class MainClass extends BaseClass{

    public void display(){
        System.out.println("What is your day");
    }

    public static void main(String args[]){

        BaseClass bs = new MainClass();
        bs.display();
        System.out.println(bs.getArea(10,7));
    }
}
